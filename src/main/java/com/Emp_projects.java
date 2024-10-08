package com;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import java.util.List;

@Entity
public class Emp_projects {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
		int project_id;
		String project_name;
	
	
	public Emp_projects(int project_id, String project_name, int emp_id) {
		super();
		this.project_id = project_id;
		this.project_name = project_name;
		this.emp_id = emp_id;
	}

	public Emp_projects() {
		super();
	}

	public Emp_projects(String project_name, int emp_id) {
		super();
		this.project_name = project_name;
		this.emp_id = emp_id;
	}

	@Override
	public String toString() {
		return "Emp_projects [project_id=" + project_id + ", project_name=" + project_name + ", emp_id=" + emp_id + "]";
	}

	public int getProject_id() {
		return project_id;
	}

	public void setProject_id(int project_id) {
		this.project_id = project_id;
	}

	public String getProject_name() {
		return project_name;
	}

	public void setProject_name(String project_name) {
		this.project_name = project_name;
	}

	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	int emp_id;
	
	
		
		
	
}
