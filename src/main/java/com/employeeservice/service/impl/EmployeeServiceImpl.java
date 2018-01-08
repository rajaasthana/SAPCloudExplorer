package com.employeeservice.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employeeservice.dto.EmployeeDto;
import com.employeeservice.model.Employee;
import com.employeeservice.repository.EmployeeRepository;
import com.employeeservice.service.EmployeeService;

/**
 * Implementation for Service layer
 * 
 * @author Raja Asthana
 * @since Dec-2017
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	public void add(Employee emp) {
		
		EmployeeDto dto = new EmployeeDto();
		BeanUtils.copyProperties(emp, dto);
		
		employeeRepository.save(dto);
	}

}