package com.pradeep.spring.mongodb.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pradeep.spring.mongodb.model.Employee;
import com.pradeep.spring.mongodb.service.EmployeeService;
import com.pradeep.spring.mongodb.util.CustomMessage;

@RestController
@RequestMapping("/v1")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeController.class);

	@RequestMapping(value = "/employees", method = RequestMethod.GET)
	public ResponseEntity<List<Employee>> getAllEmployee() {

		LOGGER.info("getAllEmployee() is getting executed.");

		List<Employee> employees = employeeService.getAllEmployee();

		if (employees.size() == 0) {
			return new ResponseEntity<List<Employee>>(HttpStatus.OK);
		}
		return new ResponseEntity<List<Employee>>(employees, HttpStatus.OK);
	}

	@RequestMapping(value = "/employee/name/{name}", method = RequestMethod.GET)
	public ResponseEntity<?> getEmployeeByName(@PathVariable String name) {

		LOGGER.info("getEmployeeByName() is getting executed for name: {}", name);

		Employee employee = employeeService.getEmployeeByName(name);

		if (employee == null) {
			return new ResponseEntity<CustomMessage>(new CustomMessage("There is no employee with given name: " + name),
					HttpStatus.OK);
		}
		return new ResponseEntity<Employee>(employee, HttpStatus.OK);
	}

	@RequestMapping(value = "/employee/id/{employeeId}", method = RequestMethod.GET)
	public ResponseEntity<?> getEmployeeById(@PathVariable String employeeId) {

		LOGGER.info("getEmployeeById() is getting executed for id: {}", employeeId);

		Employee employee = employeeService.getEmployeeById(employeeId);

		if (employee == null) {
			return new ResponseEntity<CustomMessage>(
					new CustomMessage("There is no employee with given id: " + employeeId), HttpStatus.OK);
		}

		return new ResponseEntity<Employee>(employee, HttpStatus.OK);
	}

	@RequestMapping(value = "/employee", method = RequestMethod.POST)
	public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee) {

		LOGGER.info("addEmployee() is getting executed for employee: {}", employee);

		Employee emplFetchedFromDB = employeeService.addEmployee(employee);

		return new ResponseEntity<Employee>(emplFetchedFromDB, HttpStatus.CREATED);
	}

	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public ResponseEntity<Employee> updateEmployee(@RequestBody Employee employee) {

		LOGGER.info("updateEmployee() is getting executed for employee: {}", employee);

		Employee updatedEmp = employeeService.updateEmployee(employee);

		return new ResponseEntity<Employee>(updatedEmp, HttpStatus.OK);
	}

	@RequestMapping(value = "/delete/{employeeId}", method = RequestMethod.DELETE)
	public ResponseEntity<String> deleteEmployee(@PathVariable String employeeId) {

		LOGGER.info("deleteEmployee() is getting executed for employee with id: {}", employeeId);

		employeeService.deleteEmployee(employeeId);

		return new ResponseEntity<String>("Employee deleted with id: " + employeeId, HttpStatus.OK);
	}

	@RequestMapping(value = "/delete", method = RequestMethod.DELETE)
	public ResponseEntity<String> deleteAllEmployee() {

		LOGGER.info("deleteAllEmployee() is getting executed");

		employeeService.deleteAllEmployee();

		return new ResponseEntity<String>("All Employee got deleted.", HttpStatus.OK);
	}

}
