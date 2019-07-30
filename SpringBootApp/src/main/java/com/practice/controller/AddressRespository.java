package com.practice.controller;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRespository extends CrudRepository<Address, Integer>{

	List<Address> findByEmployeeId(Integer id);
	
}
