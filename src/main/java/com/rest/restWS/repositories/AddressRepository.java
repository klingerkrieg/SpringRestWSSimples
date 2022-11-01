package com.rest.restWS.repositories;

import org.springframework.data.repository.CrudRepository;

import com.rest.restWS.entities.Address;

public interface AddressRepository extends CrudRepository<Address, Long> {}
