package com.rest.restWS.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rest.restWS.entities.PhoneNumber;


public interface PhoneNumberRepository extends JpaRepository<PhoneNumber, Long> {}