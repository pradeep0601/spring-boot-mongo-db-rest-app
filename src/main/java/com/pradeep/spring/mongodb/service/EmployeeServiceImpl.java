package com.pradeep.spring.mongodb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pradeep.spring.mongodb.dao.EmployeeDAO;
import com.pradeep.spring.mongodb.model.Employee;

/**
 * 
 * @author Pradeep
 *
 */

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDAO employeeDAO;

	@Override
	public Employee getEmployeeById(String id) {
		return employeeDAO.getEmployeeById(id);
	}

	@Override
	public Employee getEmployeeByName(String name) {
		return employeeDAO.getEmployeeByName(name);
	}

	@Override
	public List<Employee> getAllEmployee() {
		return employeeDAO.getAllEmployee();
	}

	@Override
	public Employee addEmployee(Employee employee) {
		return employeeDAO.addEmployee(employee);

	}

	@Override
	public Employee updateEmployee(Employee employee) {
		return employeeDAO.updateEmployee(employee);

	}

	@Override
	public void deleteEmployee(String employeeId) {
		employeeDAO.deleteEmployee(employeeId);

	}

	@Override
	public void deleteAllEmployee() {
		employeeDAO.deleteAllEmployee();

	}

}
