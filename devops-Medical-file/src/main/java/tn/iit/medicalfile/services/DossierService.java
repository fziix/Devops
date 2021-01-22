package tn.iit.medicalfile.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.iit.medicalfile.dao.DossierDao;
import tn.iit.medicalfile.domain.Dossier;
import tn.iit.medicalfile.dto.DossierDto;
import tn.iit.medicalfile.mappers.DossierMapper;

import javax.transaction.Transactional;
import java.util.Collection;
import java.util.List;
@Transactional
@Service
public class DossierService {
    private final DossierDao dossierDao;

    @Autowired
    public DossierService(DossierDao dossierDao) {
        this.dossierDao = dossierDao;
    }

    public DossierDto save(DossierDto dossierDto) {
       this.dossierDao.saveAndFlush (DossierMapper.dossierDtoToDossier (dossierDto));
       return dossierDto;
    }

    public void deleteById(Long id) {
        this.dossierDao.deleteById (id);
    }

    public DossierDto findOne(Long id) {
        return DossierMapper.dossierToDossierDto (this.dossierDao.getOne (id));
    }

    public Collection<DossierDto> findAll() {
        return DossierMapper.dossiersToDossierDtos (this.dossierDao.findAll ());
    }
}
