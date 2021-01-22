package tn.iit.medicalfile.web.rest;


import org.springframework.web.bind.annotation.*;
import tn.iit.medicalfile.dto.TraitementDto;
import tn.iit.medicalfile.services.TraitementService;
import javax.validation.Valid;
import java.util.Collection;

@CrossOrigin("*")
@RequestMapping(value = "/api/traitements")
@RestController()
public class TraitementRessource {

    private final TraitementService traitementService;

    public TraitementRessource(TraitementService traitementService) {
        this.traitementService = traitementService;
    }

    @GetMapping("{id}")
    public TraitementDto findOne(@PathVariable("id") long id) {
        return this.traitementService.findOne (id);

    }

    @GetMapping
    public Collection<TraitementDto> findAll() {
        return this.traitementService.findAll ();
    }

    @PostMapping
    public TraitementDto add(@Valid @RequestBody TraitementDto traitementDto) {
        return this.traitementService.save (traitementDto);
    }

    @PutMapping
    public TraitementDto update(@Valid @RequestBody TraitementDto traitementDto) {
        return this.traitementService.save (traitementDto);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable("id") long id) {
        this.traitementService.deleteById (id);
    }
}
