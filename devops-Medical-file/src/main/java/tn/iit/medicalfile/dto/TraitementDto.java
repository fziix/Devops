package tn.iit.medicalfile.dto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@ToString

@AllArgsConstructor
public class TraitementDto {

    @NotNull
    private long id;
    @NotNull
    private long dossierId;
    @NotNull
    @Size(min = 3)
    @NotEmpty
    private String medicamentName;
    @NotNull
    private float medicamentDosage;
    @NotNull
    private float medicamentPrice;
    @NotNull
    private long medicamentId;

    public TraitementDto() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getDossierId() {
        return dossierId;
    }

    public void setDossierId(long dossierId) {
        this.dossierId = dossierId;
    }

    public String getMedicamentName() {
        return medicamentName;
    }

    public void setMedicamentName(String medicamentName) {
        this.medicamentName = medicamentName;
    }

    public float getMedicamentDosage() {
        return medicamentDosage;
    }

    public void setMedicamentDosage(float medicamentDosage) {
        this.medicamentDosage = medicamentDosage;
    }

    public float getMedicamentPrice() {
        return medicamentPrice;
    }

    public void setMedicamentPrice(float medicamentPrice) {
        this.medicamentPrice = medicamentPrice;
    }

    public long getMedicamentId() {
        return medicamentId;
    }

    public void setMedicamentId(long medicamentId) {
        this.medicamentId = medicamentId;
    }
    
}
