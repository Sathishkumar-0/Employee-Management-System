package com.samuel.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.samuel.Entity.Employee;
import com.samuel.Service.EmployeeService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping
	public Employee addEmployee(@Valid @RequestBody Employee emp ) {
		return employeeService.addEmployee(emp);
	}
	
	@GetMapping("/{id}")
	public Employee getEmployee(@PathVariable("id") int id) {
		return employeeService.getEmployee(id);
	}
	
	@PutMapping("/{id}")
	public Employee updateEmployee(@Valid @RequestBody Employee emp, @PathVariable("id") int id) {
		if(employeeService.updateEmployee(emp,id)!=null) {
			return employeeService.updateEmployee(emp,id);
		}else {
			return emp;
		}
	}
	
	@GetMapping
	public List<Employee> getAllEmployee(){
		return employeeService.getAllEmployee();
	}
	
	@DeleteMapping("/{id}")
	public void deleteEmployee(@PathVariable("id") int id) {
		employeeService.deleteEmployee(id);
	}
}
