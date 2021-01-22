package tn.iit.medicalfile.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import javax.validation.constraints.NotNull;

@Data
@ToString
@AllArgsConstructor
public class DossierDto{
    private long id;
    @NotNull
    private long patientId;
    public DossierDto(Long id){
        this.id=id;
    }

    public DossierDto() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getPatientId() {
        return patientId;
    }

    public void setPatientId(long patientId) {
        this.patientId = patientId;
    }
    
}
