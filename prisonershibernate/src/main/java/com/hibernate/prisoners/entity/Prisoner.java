package com.hibernate.prisoners.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Prisoner {
	
	@Id
	private int prisonersId;
	
	private String firstName;
	
	private String lastName;
	
	private String p_password;
	
	private String dob;
	
	private String gender;

	public Prisoner() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Prisoner(int prisonersId, String firstName, String lastName, String p_password, String dob, String gender) {
		this.prisonersId = prisonersId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.p_password = p_password;
		this.dob = dob;
		this.gender = gender;
	}

	public int getPrisonersId() {
		return prisonersId;
	}

	public void setPrisonersId(int prisonersId) {
		this.prisonersId = prisonersId;
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

	public String getP_password() {
		return p_password;
	}

	public void setP_password(String p_password) {
		this.p_password = p_password;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Prisoner [prisonersId=" + prisonersId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", p_password=" + p_password + ", dob=" + dob + ", gender=" + gender + "]";
	}
	
	
	
}
