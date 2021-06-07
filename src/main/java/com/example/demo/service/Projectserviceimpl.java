package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;
import com.example.demo.entity.Project;
import com.example.demo.repository.Employeerepository;
import com.example.demo.repository.Projectrepository;

@Service
public class Projectserviceimpl implements Projectservice {
	@Autowired
	private Projectrepository prepo;
	@Autowired
	private Employeerepository Erepo;
	
	public Project Addproject(Project project)
	{
		return prepo.save(project);
	}	
//
//	@Override
//	public Project Addproject(Project project,int id) {
//          Employee e=Erepo.findById(id).get();
//          e.getProject().add(project);
//          project.getEmp().add(e);
//          Erepo.save(e);
//          
//		return prepo.save(project);
		
		
	
	
//
//	@Override
//	public List<Project> getproject() {
//	
//		return prepo.findAll();
//	}

}
