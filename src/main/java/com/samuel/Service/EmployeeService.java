package com.samuel.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.samuel.Entity.Employee;
import com.samuel.Exception.ResourceNotFoundException;
import com.samuel.Repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	public Employee addEmployee(Employee emp) {
		return employeeRepository.save(emp);	
	}
	
	public Employee getEmployee(int id) {
		return employeeRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("Employee not Found") );
	}
	
	public Employee updateEmployee(Employee emp,int id) {
		
		Employee exEmp = employeeRepository.findById(id).orElseThrow(()->new RuntimeException("Employee not found with id: "+id));
			exEmp.setName(emp.getName());
			exEmp.setEmail(emp.getEmail());
			exEmp.setDepartment(emp.getDepartment());
			exEmp.setSalary(emp.getSalary());
			
			return employeeRepository.save(exEmp);
	}
	
	public List<Employee> getAllEmployee(){
		return (ArrayList<Employee>) employeeRepository.findAll();
	}
	
	public void deleteEmployee(int id) {
		employeeRepository.deleteById(id);
	}
}
