package tn.iit.medicalfile.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

@Data
@ToString

@AllArgsConstructor
public class PatientDto {
    private long id;
    @NotNull
    private Date birthday;
    @NotNull
    @NotEmpty
    private String name;
    @NotNull
    @Size(min = 8,max = 8)
    private long cin;

    public PatientDto(long id)
    {
        this.id=id;
    }

    public PatientDto() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getCin() {
        return cin;
    }

    public void setCin(long cin) {
        this.cin = cin;
    }

}
