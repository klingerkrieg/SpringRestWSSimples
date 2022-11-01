package com.rest.restWS.services;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.restWS.entities.PhoneNumber;
import com.rest.restWS.repositories.PhoneNumberRepository;

@Service
public class PhoneNumberServiceImpl implements PhoneNumberService {
      
    @Autowired
    private PhoneNumberRepository phoneNumberRepository;
    
    // save operation
    @Override
    public PhoneNumber savePhoneNumber(PhoneNumber department) {
        return phoneNumberRepository.save(department);
    }
    
    // read operation
    @Override
    public List<PhoneNumber> fetchPhoneNumberList() {
        return (List<PhoneNumber>) phoneNumberRepository.findAll();
    }
    
    // update operation
    @Override
    public PhoneNumber updatePhoneNumber(PhoneNumber phoneNumber, Long phoneNumberId) {
        PhoneNumber depDB = phoneNumberRepository.findById(phoneNumberId).get();
    
        if (Objects.nonNull(phoneNumber.getPhone()) && !"".equalsIgnoreCase(phoneNumber.getPhone())) {
            depDB.setPhone(phoneNumber.getPhone());
        }
    
        if (Objects.nonNull(phoneNumber.getType()) && !"".equals(phoneNumber.getType())) {
            depDB.setType(phoneNumber.getType());
        }
    
        return phoneNumberRepository.save(depDB);
    }
    
    // delete operation
    @Override
    public void deletePhoneNumberById(Long phoneNumberId) {
        phoneNumberRepository.deleteById(phoneNumberId);
    }
      
}
