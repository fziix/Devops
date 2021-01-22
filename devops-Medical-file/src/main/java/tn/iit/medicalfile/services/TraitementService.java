package tn.iit.medicalfile.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.iit.medicalfile.dao.TraitementDao;
import tn.iit.medicalfile.dto.MedicamentDto;
import tn.iit.medicalfile.dto.TraitementDto;
import tn.iit.medicalfile.mappers.TraitementMapper;

import javax.transaction.Transactional;
import java.util.Collection;

@Transactional
@Service
public class TraitementService {
    private final TraitementDao traitementDao;
    private final StoreManagementClientService storeManagementClientService;

    @Autowired
    public TraitementService(TraitementDao traitementDao, StoreManagementClientService storeManagementClientService) {
        this.traitementDao = traitementDao;
        this.storeManagementClientService = storeManagementClientService;
    }

    public TraitementDto save(TraitementDto traitementDto) {
        this.traitementDao.saveAndFlush (TraitementMapper.traitementDtoToTraitement (traitementDto));
        return traitementDto;
    }

    public void deleteById(Long id) {
        this.traitementDao.deleteById (id);
    }

    public TraitementDto findOne(Long id) {
        TraitementDto traitementDto= TraitementMapper.traitementToTraitementDto (this.traitementDao.getOne (id));
        MedicamentDto medicamentDto = this.storeManagementClientService.getMedicamentById (traitementDto.getMedicamentId ());
        traitementDto.setMedicamentDosage (medicamentDto.getDosage ());
        traitementDto.setMedicamentName (medicamentDto.getName ());
        traitementDto.setMedicamentPrice (medicamentDto.getPrice ());
        return traitementDto;
    }

    public Collection<TraitementDto> findAll() {
        Collection<TraitementDto> traitementDtos = TraitementMapper.traitementsToTraitementDtos (this.traitementDao.findAll ());
        traitementDtos.forEach (traitementDto -> {
            MedicamentDto medicamentDto = this.storeManagementClientService.getMedicamentById (traitementDto.getMedicamentId ());
            traitementDto.setMedicamentName (medicamentDto.getNom ());
            traitementDto.setMedicamentPrice (medicamentDto.getPrix ());
            traitementDto.setMedicamentDosage (medicamentDto.getDosage ());
        });
        return traitementDtos;
    }
}
