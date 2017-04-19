package com.pradeep.spring.mongodb.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
/**
 * 
 * @author Pradeep
 *
 */
@Document(collection = "EMPLOYEE_DOC")
public class Employee {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(Employee.class);

	@Id
	private String employeeId;
	private String name;
	private String location;
	private float salary;
	private String mobileNo;

	public Employee() {
		LOGGER.debug("Employee()");
	}

	public Employee(String name, String location, float salary, String mobileNo) {
		super();
		this.name = name;
		this.location = location;
		this.salary = salary;
		this.mobileNo = mobileNo;
		LOGGER.debug("Employee(-,-,-,-)");
	}

	public Employee(String employeeId, String name, String location, float salary, String mobileNo) {
		super();
		this.employeeId = employeeId;
		this.name = name;
		this.location = location;
		this.salary = salary;
		this.mobileNo = mobileNo;
		LOGGER.debug("Employee(-,-,-,-,-)");
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", name=" + name + ", location=" + location + ", salary=" + salary
				+ ", mobileNo=" + mobileNo + "]";
	}

}
