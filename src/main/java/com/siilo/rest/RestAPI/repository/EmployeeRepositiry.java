package com.siilo.rest.RestAPI.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.siilo.rest.RestAPI.model.Employee;

@Repository
public interface EmployeeRepositiry extends JpaRepository<Employee, Integer>{
	
	public Employee getEmployeeByName(String name);
	
	@Query("Select e from Employee e where e.skills=:skills")
	public List<Employee> findSkills(@Param("skills") String skills);

}
