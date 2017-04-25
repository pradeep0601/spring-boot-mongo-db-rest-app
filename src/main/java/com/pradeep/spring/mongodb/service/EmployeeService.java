package com.pradeep.spring.mongodb.service;

import java.util.List;

import com.pradeep.spring.mongodb.model.Employee;
/**
 * 
 * @author Pradeep
 *
 */
public interface EmployeeService {

	public Employee getEmployeeById(String id);

	public Employee getEmployeeByName(String name);

	public List<Employee> getAllEmployee();

	public Employee addEmployee(Employee employee);

	public Employee updateEmployee(Employee employee);

	public void deleteEmployee(String employeeId);

	public void deleteAllEmployee();
	
	public List<Employee> getEmployeeByNameAndLocation(String name, String location);

}
