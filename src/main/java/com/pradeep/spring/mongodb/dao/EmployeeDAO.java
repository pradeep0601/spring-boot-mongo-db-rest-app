package com.pradeep.spring.mongodb.dao;

import java.util.List;

import com.pradeep.spring.mongodb.model.Employee;

/**
 * 
 * @author Pradeep
 *
 */
public interface EmployeeDAO {

	public Employee getEmployeeById(String id);

	public Employee getEmployeeByName(String name);

	public List<Employee> getAllEmployee();

	public Employee addEmployee(Employee employee);

	public Employee updateEmployee(Employee employee);

	public void deleteEmployee(String employeeId);

	public void deleteAllEmployee();

}
