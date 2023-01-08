package com.siilo.rest.RestAPI.restcontroller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.siilo.rest.RestAPI.model.Employee;
import com.siilo.rest.RestAPI.service.IEmployeService;

@RestController
public class EmployeeRestService implements IEmployeeRestService {

	@Autowired
	IEmployeService employeeService;

	@Override
	@GetMapping("/employees")
	public List<Employee> getAllEmployee() {
		return employeeService.getAllEmp();
	}

	@Override
	@GetMapping("/employee")
	public Employee getEmpByName(@RequestParam String name) {
		return employeeService.getEmpByName(name);
	}

	@Override
	@GetMapping("/employee/{id}")
	public Employee getEmpById(@PathVariable(value = "id") Integer id) {
		return employeeService.getEmpById(id);
	}

	@Override
	@PostMapping("/employee")
	public void createEmployee(@RequestBody Employee emp) {
		employeeService.createEmployee(emp);
	}

	@Override
	@DeleteMapping("/employee/{id}")
	public void deleteEmployee(@PathVariable(value = "id") Integer id) {
		employeeService.deleteEmployee(id);
	}

	@Override
	@GetMapping("/employee/skills")
	public List<Employee> findSkills(@RequestParam String skills) {
		return employeeService.findSkills(skills);
	}
}
