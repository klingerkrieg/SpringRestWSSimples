package com.rest.restWS.entities.customValidation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import com.rest.restWS.entities.PhoneType;

@Target({ElementType.METHOD, 
        ElementType.FIELD, 
        ElementType.ANNOTATION_TYPE, 
        ElementType.CONSTRUCTOR, 
        ElementType.PARAMETER, 
        ElementType.TYPE_USE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy = PhoneTypeValidator.class)
public @interface PhoneTypeValidation {
    PhoneType[] anyOf();
    String message() default "must be any of {anyOf}";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}