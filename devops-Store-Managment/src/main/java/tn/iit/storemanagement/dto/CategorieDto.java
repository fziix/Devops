package tn.iit.storemanagement.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@ToString

public class CategorieDto {
    private long id;
    @NotNull
    @NotEmpty
    @Size(min =2)
    private String nom;

    public CategorieDto() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public CategorieDto(long id, @NotNull @NotEmpty @Size(min = 2) String nom) {
        this.id = id;
        this.nom = nom;
    }
}
