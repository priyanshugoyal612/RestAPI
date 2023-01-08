package com.siilo.rest.RestAPI.restcontroller;

import java.util.List;

import com.siilo.rest.RestAPI.model.Employee;

public interface IEmployeeRestService {

	List<Employee> getAllEmployee();

	Employee getEmpByName(String name);

	Employee getEmpById(Integer id);

	void createEmployee(Employee emp);

	void deleteEmployee(Integer id);

	List<Employee> findSkills(String skill);

}