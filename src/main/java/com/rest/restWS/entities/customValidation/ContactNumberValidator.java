package com.rest.restWS.entities.customValidation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ContactNumberValidator implements 
  ConstraintValidator<ContactNumber, String> {

    @Override
    public void initialize(ContactNumber contactNumber) {
    }

    @Override
    public boolean isValid(String contactField,
      ConstraintValidatorContext cxt) {
        
        if (contactField == null){
          return true;
        }

        return contactField != null && contactField.matches("\\([0-9]{2}\\) [0-9]{4,5}\\-[0-9]{4}");

        /*return contactField != null && contactField.matches("[0-9]+")
          && (contactField.length() > 8) && (contactField.length() < 16);*/
    }

}