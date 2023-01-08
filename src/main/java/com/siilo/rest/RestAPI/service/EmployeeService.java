package com.siilo.rest.RestAPI.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.siilo.rest.RestAPI.model.Employee;
import com.siilo.rest.RestAPI.repository.EmployeeRepositiry;

@Service
public class EmployeeService implements  IEmployeService{
	
	@Autowired
	
	private EmployeeRepositiry employeeRepository;
	

	@Override
	public List<Employee> getAllEmp() {
		// TODO Auto-generated method stub
		return employeeRepository.findAll();
	}

	@Override
	public Employee getEmpByName(String name) {
		// TODO Auto-generated method stub
		return employeeRepository.getEmployeeByName(name);
	}

	@Override
	public Employee getEmpById(int id) {
		// TODO Auto-generated method stub
		return employeeRepository.findById(id).get();
	}

	@Override
	public void createEmployee(Employee emp) {
		employeeRepository.save(emp);
		
	}

	@Override
	public void deleteEmployee(int id) {
		employeeRepository.deleteById(id);
		
	}

	@Override
	public List<Employee> findSkills(String skills) {
		// TODO Auto-generated method stub
		System.out.println(skills);
		return employeeRepository.findSkills(skills);
	}

}
