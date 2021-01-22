package tn.iit.storemanagement.dto;

import lombok.*;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

@Data
@ToString

@AllArgsConstructor
public class MedicamentDto {
    private long id;
    @NotNull
    @NotEmpty
    @Size(min = 3)
    private String nom;
    @NotNull
    private float prix;
    @NotNull
    private Date dateExpiration;
    @NotNull
    private long categotieId;
    @NotNull
    @Size(min = 3)
    private String categorieNom;

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

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public Date getDateExpiration() {
        return dateExpiration;
    }

    public void setDateExpiration(Date dateExpiration) {
        this.dateExpiration = dateExpiration;
    }

    public long getCategotieId() {
        return categotieId;
    }

    public void setCategotieId(long categotieId) {
        this.categotieId = categotieId;
    }

    public String getCategorieNom() {
        return categorieNom;
    }

    public void setCategorieNom(String categorieNom) {
        this.categorieNom = categorieNom;
    }

    public MedicamentDto() {
    }
}
