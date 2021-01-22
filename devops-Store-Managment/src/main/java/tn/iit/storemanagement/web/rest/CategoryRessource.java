package tn.iit.storemanagement.web.rest;


import org.springframework.web.bind.annotation.*;
import tn.iit.storemanagement.dto.CategorieDto;
import tn.iit.storemanagement.services.CategoryService;

import javax.validation.Valid;
import java.util.Collection;

@CrossOrigin("*")
@RequestMapping(value = "/api/categories")
@RestController()
public class CategoryRessource {

    private final CategoryService categoryService;

    public CategoryRessource(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping("{id}")
    public CategorieDto findOne(@PathVariable("id") long id) {
        return this.categoryService.findOne (id);
    }

    @GetMapping
    public Collection<CategorieDto> findAll(){
        return this.categoryService.findAll ();
    }

    @PostMapping
    public CategorieDto add(@Valid @RequestBody CategorieDto categorieDto){
        return this.categoryService.save (categorieDto);
    }

    @PutMapping
    public CategorieDto update(@Valid @RequestBody CategorieDto categorieDto){
        return this.categoryService.save (categorieDto);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable("id") long id){
        this.categoryService.deleteById (id);
    }

}
