package com.pradeep.spring.mongodb.repository;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import com.pradeep.spring.mongodb.model.Employee;

/**
 * 
 * @author Pradeep
 *
 *         The implementation class name is very strict, the name must be
 *         "CoreRepositoryInterface" + Impl
 * 
 * 
 */
public class EmployeeRepositoryImpl implements EmployeeRepositoryCustom {

	private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeRepositoryImpl.class);

	@Autowired
	private MongoTemplate mongoTemplate;

	@Override
	public List<Employee> getEmployeeByNameLocation(String name, String location) {

		LOGGER.info("getEmployeeByNameLocation(-, -), name: {}, location: {}", name, location);

		Query query = new Query();

		Criteria nameCrit = Criteria.where("name").is(name);
		Criteria locationCrit = Criteria.where("location").is(location);

		Criteria criteria = nameCrit.andOperator(locationCrit);

		query.addCriteria(criteria);
		
		List<Employee> employees = mongoTemplate.find(query, Employee.class);

		return employees;
	}

}
