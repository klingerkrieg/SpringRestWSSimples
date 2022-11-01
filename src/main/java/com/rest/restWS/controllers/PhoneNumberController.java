package com.rest.restWS.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rest.restWS.entities.PhoneNumber;
import com.rest.restWS.services.PhoneNumberService;


@RestController
public class PhoneNumberController {
  
    @Autowired 
    private PhoneNumberService phoneNumberService;
  
    // Save operation
    @PostMapping("/phone")
    public PhoneNumber save(@Valid @RequestBody PhoneNumber phoneNumber){
        return phoneNumberService.savePhoneNumber(phoneNumber);
    }
  
    // Read operation
    @GetMapping("/phone")
    public List<PhoneNumber> fetchList() {
        return phoneNumberService.fetchPhoneNumberList();
    }
  
    // Update operation
    @PutMapping("/phone/{id}")
    public PhoneNumber update(@RequestBody PhoneNumber phoneNumber,
                     @PathVariable("id") Long phoneNumberId) {
  
        return phoneNumberService.updatePhoneNumber(phoneNumber, phoneNumberId);
    }
  
    // Delete operation
    @DeleteMapping("/phone/{id}")
    public String deleteById(@PathVariable("id")
                                       Long phoneNumberId) {
  
        phoneNumberService.deletePhoneNumberById( phoneNumberId);
        return "Deleted Successfully";
    }
}