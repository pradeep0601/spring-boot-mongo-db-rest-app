package com.pradeep.spring.mongodb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pradeep.spring.mongodb.model.Employee;
import com.pradeep.spring.mongodb.repository.EmployeeRepository;

/**
 * 
 * @author Pradeep
 *
 */

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository repository;

	@Override
	public Employee getEmployeeById(String id) {
		
		return repository.findByEmployeeId(id);
	}

	@Override
	public Employee getEmployeeByName(String name) {
		return repository.findByName(name);
	}

	@Override
	public List<Employee> getAllEmployee() {
		return repository.findAll();
	}

	@Override
	public Employee addEmployee(Employee employee) {
		return repository.insert(employee);

	}

	@Override
	public Employee updateEmployee(Employee employee) {
		if(employee.getEmployeeId() == null){
			return null;
		}
		return repository.save(employee);
	}

	@Override
	public void deleteEmployee(String employeeId) {
		repository.delete(employeeId);

	}

	@Override
	public void deleteAllEmployee() {
		repository.deleteAll();

	}

	@Override
	public List<Employee> getEmployeeByNameAndLocation(String name, String location) {
		return repository.getEmployeeByNameLocation(name, location);
	}

}
