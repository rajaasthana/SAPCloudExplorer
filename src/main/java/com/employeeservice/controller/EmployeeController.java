package com.employeeservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.employeeservice.model.Employee;
import com.employeeservice.service.EmployeeService;

/**
 * Controller class to handle request to generate and sort random numbers
 * 
 * @author Raja Asthana
 * @since Dec-2017
 */
@Controller
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@PostMapping(value = "/create")
	public void createEmployee(@RequestBody Employee employee) {
		employeeService.add(employee);
	}
}
