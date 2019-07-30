package com.practice.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/crud")
public class RestController2 {
	
	@Autowired
	private RestService restService; 


	@RequestMapping(method = RequestMethod.GET, value = "/employees/{employeeId}/addresses")
	public List<Address> getAddresses(@PathVariable("employeeId") Integer employeeId){
		return restService.getAddresses(employeeId);
	}
	
	
}
