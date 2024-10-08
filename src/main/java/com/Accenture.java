package com;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import org.hibernate.annotations.Generated;

import java.util.List;

@Entity
public class Accenture {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)  // This will increment number automatically
	int emp_id;
	public List<Emp_projects> getProject() {
		return project;
	}
	public void setProject(List<Emp_projects> project) {
		this.project = project;
	}
	String emp_name;
	String emp_department;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="emp_id")
		List <Emp_projects> project;
	public int getEmp_id() {
		return emp_id;
	}
	public Accenture(String emp_name, String emp_department) {
		super();
		this.emp_name = emp_name;
		this.emp_department = emp_department;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public Accenture() {
		super();
	}
	public String getEmp_name() {
		return emp_name;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	public String getEmp_department() {
		return emp_department;
	}
	public void setEmp_department(String emp_department) {
		this.emp_department = emp_department;
	}
	public Infosys(int emp_id, String emp_name, String emp_department) {
		super();
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.emp_department = emp_department;
	}
	@Override
	public String toString() {
		return "Infosys [emp_id=" + emp_id + ", emp_name=" + emp_name + ", emp_department=" + emp_department + "]";
	}
	

}
