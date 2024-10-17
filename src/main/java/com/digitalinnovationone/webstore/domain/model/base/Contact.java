package com.digitalinnovationone.webstore.domain.model.base;

import jakarta.persistence.Column;

import java.io.Serializable;
import java.util.List;

public class Contact implements Serializable {
    private String email;
    
    @Column(name = "phone_number")
    private List<String> phone_number;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public List<String> getPhone_number() {
        return phone_number;
    }
    
    public void setPhone_number(List<String> phone_number) {
        this.phone_number = phone_number;
    }
}