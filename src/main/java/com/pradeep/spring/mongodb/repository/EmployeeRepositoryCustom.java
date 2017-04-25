package com.pradeep.spring.mongodb.repository;

import java.util.List;

import com.pradeep.spring.mongodb.model.Employee;

/**
 * 
 * @author Pradeep
 *
 *         To enrich a repository with custom functionality you have to define
 *         an interface and an implementation for that functionality first and
 *         let the repository interface you provided so far extend that custom
 *         interface.
 */
public interface EmployeeRepositoryCustom {

	public List<Employee> getEmployeeByNameLocation(String name, String location);
}
