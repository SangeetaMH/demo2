package com.example.demo.contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;
import com.example.demo.service.Employeeserviceimpl;

@RestController
public class Employeecontrollers {
	@Autowired
	private Employeeserviceimpl impl;
  @PostMapping("/addemployee")
	private Employee AddEmployeedetails(@RequestBody Employee emp)
	{
		 return impl.addEmployee(emp);
	}
    @PutMapping("/upadate/{id}")
    private void updateEmployee(@RequestBody Employee emp,@PathVariable int id)
    {
    	impl.updateEmployee(emp, id);
    }
    @GetMapping("")
    private List<Employee> getEmployeedetails()
    {
		return impl.getEmployee();
    	
    }
	@DeleteMapping("{id}")
	private void DeleteEmployeedetails(@PathVariable int id)
	{
		impl.deleteEmployee(id);
	}
	}












//@PostMapping("/addemployee/{id}")
//private Employee AddEmployeedetails(@RequestBody Employee emp,@PathVariable int id)
//{
//	 return impl.addEmployee(emp,id);
//}
//@GetMapping("{id}")
//private List<Employee> getEmployee(@PathVariable int id)
//{
//	return impl.getEmployee(id);
//	
//}