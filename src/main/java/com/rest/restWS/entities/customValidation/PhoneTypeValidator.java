package com.rest.restWS.entities.customValidation;

import java.util.Arrays;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.rest.restWS.entities.PhoneType;

public class PhoneTypeValidator implements 
    ConstraintValidator<PhoneTypeValidation, PhoneType> {
    private PhoneType[] subset;

    @Override
    public void initialize(PhoneTypeValidation constraint) {
        this.subset = constraint.anyOf();
    }

    @Override
    public boolean isValid(PhoneType value, ConstraintValidatorContext context) {
        return value == null || Arrays.asList(subset).contains(value);
    }
}