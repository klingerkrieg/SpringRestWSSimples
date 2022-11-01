package com.rest.restWS.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

import org.hibernate.validator.constraints.Length;

import com.rest.restWS.entities.customValidation.ContactNumber;
import com.rest.restWS.entities.customValidation.PhoneTypeValidation;

@Entity
public class PhoneNumber {
    private @Id @GeneratedValue Long id;

    //Aqui foi usado enum, mas poderia ser usado texto
    //https://www.baeldung.com/javax-validations-enums

    @PhoneTypeValidation(anyOf = {PhoneType.HOME, 
                                    PhoneType.WORK, 
                                    PhoneType.CEL})
    private PhoneType type;

    @ContactNumber
    private String phone;

    
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public PhoneType getType() {
        return type;
    }

    public void setType(PhoneType type) {
        this.type = type;
    }
}
