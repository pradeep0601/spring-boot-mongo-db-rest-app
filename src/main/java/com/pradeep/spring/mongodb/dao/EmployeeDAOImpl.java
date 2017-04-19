package com.pradeep.spring.mongodb.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.pradeep.spring.mongodb.model.Employee;
import com.pradeep.spring.mongodb.repository.EmployeeRepository;

/**
 * 
 * @author Pradeep
 *
 */
@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

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

}
