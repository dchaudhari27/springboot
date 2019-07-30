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
@RequestMapping("/crud1")
public class RestController {
	
	@Autowired
	private RestService restService; 

	/*@RequestMapping(method = RequestMethod.GET, value = "/employees")
	public List<Employee> getEmployees(){
		//return Arrays.asList(new Employee(1, "Dhanesh", "IT"), new Employee(1, "Jignesh", "IT"));
		return restService.getEmployees();
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/employees")
	public void saveEmployee(@RequestBody Employee emp){
		restService.saveEmployee(emp);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/employees")
	public void updateEmployee(@RequestBody Employee emp){
		restService.updateEmployee(emp);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/employees/{id}")
	public void deleteEmployee(@PathVariable("id") Integer id){
		restService.deleteEmployee(id);
	}
	*/

}
