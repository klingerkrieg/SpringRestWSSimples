package com.rest.restWS.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.rest.restWS.entities.PhoneNumber;


public interface PhoneNumberRepository extends JpaRepository<PhoneNumber, Long> {


}