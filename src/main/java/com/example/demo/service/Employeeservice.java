package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Employee;

public interface Employeeservice {
	Employee addEmployee(Employee emp);
	void updateEmployee(Employee emp,int id);
	List<Employee> getEmployee();
	void deleteEmployee(int id);
	//Employee addEmployee(Employee emp,int id);
	//public List<Employee> getEmployee(int id);
	//public Employee addEmployee1(Employee emp,int id);
}
