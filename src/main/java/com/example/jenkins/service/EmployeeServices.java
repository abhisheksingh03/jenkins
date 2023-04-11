package com.example.jenkins.service;

import java.util.List;

import com.example.jenkins.entity.Employee;

public interface EmployeeServices {
	List<Employee> getAllEmployee();

	void save(Employee employee);

	Employee getById(Long id);

	void deleteViaId(long id);
}
