package com.example.demo.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Project {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	@Column(name="project_id")
	private int id;
	@Column(name="title")
	private String title;
	@ManyToMany(mappedBy = "project",cascade = {CascadeType.PERSIST,CascadeType.MERGE})
	@JsonIgnore
	private List<Employee> emp=new ArrayList<>();
	public Project(int id, String title, List<Employee> emp) {
		super();
		this.id = id;
		this.title = title;
		this.emp = emp;
	}
	public Project() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public List<Employee> getEmp() {
		return emp;
	}
	public void setEmp(List<Employee> emp) {
		this.emp = emp;
	}
	
	
	
	
	
	}


