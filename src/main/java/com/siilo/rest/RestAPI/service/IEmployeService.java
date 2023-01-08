package com.siilo.rest.RestAPI.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.siilo.rest.RestAPI.model.Employee;

@Service
public interface IEmployeService {
	
	public List<Employee> getAllEmp();
	public Employee getEmpByName(String name);
	public Employee getEmpById(int id);
	public void createEmployee(Employee emp);
	public void deleteEmployee(int id);
	public List<Employee> findSkills(String skill);
	
	

}
