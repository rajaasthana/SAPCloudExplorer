package com.employeeservice.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employeeservice.dto.EmployeeDto;

/**
 * Repository layer for the application. Spring framework will autowire
 * SimpleJpaRepository as the default implementation
 * 
 * @author Raja Asthana
 * @since Dec-2017
 */
public interface EmployeeRepository extends JpaRepository<EmployeeDto, Serializable> {

	/**
	 * Query method to retrieve all data from database sorted by ID descending
	 * 
	 * @return All data from DB
	 */
	public List<EmployeeDto> findAllByOrderByIdDesc();
}
