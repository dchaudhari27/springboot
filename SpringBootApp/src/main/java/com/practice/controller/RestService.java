package com.practice.controller;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class RestService {
	
//	@Autowired
//	private RestRepository repository;
	
	@Autowired
	private AddressRespository addressRepo;

/*	public List<Employee> getEmployees() {
		List<Employee> employees = new ArrayList<Employee>();
		repository.findAll().forEach(e->employees.add(e));
		return employees;
	}

	public void saveEmployee(Employee emp) {
		repository.save(emp);
		
	}

	public void updateEmployee(Employee emp) {
		repository.save(emp);
		
	}

	public void deleteEmployee(Integer empId) {
		repository.deleteById(empId);
		
	}*/

	public List<Address> getAddresses(Integer id) {
		List<Address> addresses = new ArrayList<Address>();
		addressRepo.findByEmployeeId(id).forEach(a -> addresses.add(a));
		return addresses;
	}

//	public List<Address> getAddressesByName(String name) {
//		List<Address> addresses = new ArrayList<Address>();
//		addressRepo.findByEmployeeName(name).forEach(a -> addresses.add(a));
//		return addresses;
//	}

	
}
