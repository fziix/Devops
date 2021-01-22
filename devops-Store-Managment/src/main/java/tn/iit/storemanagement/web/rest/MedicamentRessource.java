package tn.iit.storemanagement.web.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.iit.storemanagement.dto.MedicamentDto;
import tn.iit.storemanagement.services.MedicamentService;

import javax.validation.Valid;
import java.util.Collection;

@CrossOrigin("*")
@RequestMapping(value = "/api/medicaments")
@RestController()
public class MedicamentRessource {

    private final MedicamentService medicamentService;

    public MedicamentRessource(MedicamentService medicamentService) {
        this.medicamentService = medicamentService;
    }

    @GetMapping("/{id}")
    public MedicamentDto findOne(@PathVariable("id") long id) {

        return this.medicamentService.findOne (id);
    }

    @GetMapping()
    public Collection<MedicamentDto> findAll() {
        return this.medicamentService.findAll ();
    }

    @PostMapping
    public MedicamentDto add(@Valid @RequestBody MedicamentDto medicamentDto) {

        return this.medicamentService.save (medicamentDto);
    }

    @PutMapping()
    public MedicamentDto update(@Valid @RequestBody MedicamentDto medicamentDto) {
        return this.medicamentService.save (medicamentDto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") long id) {
        this.medicamentService.deleteById (id);
    }
}