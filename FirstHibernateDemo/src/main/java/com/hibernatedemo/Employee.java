package com.hibernatedemo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

//POJO-Plain Old Java Object
//Bean-spring
//Entity

@Entity
public class Employee {
	@Id
	private int id;
	@Column (name="empname")
	private String name;
	@Column (name="dept")
	private String dept;
	@Column (name="salary")
	private int salary;
	
	private Department deptt;
	

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String name, String dept, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dept=" + dept + ", salary=" + salary + "]";
	} 
	
	

}
