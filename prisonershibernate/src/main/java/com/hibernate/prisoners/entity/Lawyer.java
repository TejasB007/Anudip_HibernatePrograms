package com.hibernate.prisoners.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Lawyer {
	
	@Id
	private int lawyerId;
	
	private String l_password;
	
	private String firstName;
	
	private String lastName;
	
	private String specialization;
	
	private String email;
	
	private int contactNo;

	public Lawyer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Lawyer(int lawyerId, String l_password, String firstName, String lastName, String specialization,
			String email, int contactNo) {
		this.lawyerId = lawyerId;
		this.l_password = l_password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.specialization = specialization;
		this.email = email;
		this.contactNo = contactNo;
	}

	public int getLawyerId() {
		return lawyerId;
	}

	public void setLawyerId(int lawyerId) {
		this.lawyerId = lawyerId;
	}

	public String getL_password() {
		return l_password;
	}

	public void setL_password(String l_password) {
		this.l_password = l_password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getContactNo() {
		return contactNo;
	}

	public void setContactNo(int contactNo) {
		this.contactNo = contactNo;
	}

	@Override
	public String toString() {
		return "Lawyer [lawyerId=" + lawyerId + ", l_password=" + l_password + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", specialization=" + specialization + ", email=" + email + ", contactNo="
				+ contactNo + "]";
	}
	
	
	
	

}
