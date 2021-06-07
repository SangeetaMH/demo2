package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;
import com.example.demo.entity.Project;
import com.example.demo.repository.Employeerepository;
import com.example.demo.repository.Projectrepository;

@Service
public class Employeeserviceimpl implements Employeeservice {
	@Autowired
	 private Employeerepository repo;
	@Autowired
	private Projectrepository repo1;

	@Override
	public Employee addEmployee(Employee emp) {
		System.out.println("hello");
		 return repo.save(emp);
		
	}
@Override
	public void updateEmployee(Employee emp,int id) {
		 Employee  existingEmployee=repo.findById(id).get();
		  existingEmployee.setFirstname(emp.getFirstname());
		  existingEmployee.setLastname(emp.getLastname()); 
		  repo.save( existingEmployee);
		 }

	@Override
	public List<Employee> getEmployee() {

		return repo.findAll();
	}

	@Override
	public void deleteEmployee(int id) {
		repo.deleteById(id);
		
	}
}














//
//
	//@Override
//	public Employee addEmployee(Employee emp, int id) {
//		Project p=repo1.findById(id).get();
//		p.getEmp().add(emp);
//		emp.getProject().add(p);
//		repo1.save(p);
//		 return repo.save(emp);
//		
//	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	public List<Employee> getEmployee(int id)
//	{
//		Project p= repo1.findById(id).get();
//	    List<Employee> emp=p.getEmp();
//	    return repo.saveAll(emp);
//	
//   }
	

//	

	


