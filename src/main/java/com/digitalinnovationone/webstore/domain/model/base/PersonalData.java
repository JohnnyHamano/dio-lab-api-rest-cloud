package com.digitalinnovationone.webstore.domain.model.base;

import java.io.Serializable;
import java.util.Date;

public class PersonalData implements Serializable {
    private String name;
    private Date birthdate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }
}
