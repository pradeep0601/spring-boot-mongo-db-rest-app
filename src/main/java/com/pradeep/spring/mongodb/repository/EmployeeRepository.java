package com.pradeep.spring.mongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.pradeep.spring.mongodb.model.Employee;
/**
 * 
 * @author Pradeep
 *
 */
@Repository
public interface EmployeeRepository extends MongoRepository<Employee, String>, EmployeeRepositoryCustom{

	public Employee findByEmployeeId(String employeeId);//naming syntax : findBy<property name of model> 
	
	public Employee findByName(String name);
	
	public Employee findByLocation(String location);
	
	public Employee findBySalary(float salary);
	
	public Employee findByMobileNo(String mobileNo);
	
}
