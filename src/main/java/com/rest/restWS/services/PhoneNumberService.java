package com.rest.restWS.services;

import java.util.List;

import com.rest.restWS.entities.PhoneNumber;

public interface PhoneNumberService {
    // save operation
    PhoneNumber savePhoneNumber(PhoneNumber phoneNumber);
  
    // read operation
    List<PhoneNumber> fetchPhoneNumberList();
  
    // update operation
    PhoneNumber updatePhoneNumber(PhoneNumber phoneNumber, Long phoneNumberId);
  
    // delete operation
    void deletePhoneNumberById(Long phoneNumberId);
}
