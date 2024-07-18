package com.hibernatedemo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Department {

	@Id
	private int did;
	@Column (name="departmentname")
	private String dname;
	@Column (name="sub_dept")
	private String sdept;
	@Column (name="deptHead")
	private String deptt;
	

	
}
