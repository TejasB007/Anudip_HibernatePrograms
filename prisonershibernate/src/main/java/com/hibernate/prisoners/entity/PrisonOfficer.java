package com.hibernate.prisoners.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PrisonOfficer {

	@Id
	private int officerId;
	
	private String o_password;
	
	private String firstName;
	
	private String lastName;
	
	private String prisonName;

	public PrisonOfficer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PrisonOfficer(int officerId, String o_password, String firstName, String lastName, String prisonName) {
		this.officerId = officerId;
		this.o_password = o_password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.prisonName = prisonName;
	}

	public int getOfficerId() {
		return officerId;
	}

	public void setOfficerId(int officerId) {
		this.officerId = officerId;
	}

	public String getO_password() {
		return o_password;
	}

	public void setO_password(String o_password) {
		this.o_password = o_password;
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

	public String getPrisonName() {
		return prisonName;
	}

	public void setPrisonName(String prisonName) {
		this.prisonName = prisonName;
	}

	@Override
	public String toString() {
		return "PrisonOfficer [officerId=" + officerId + ", o_password=" + o_password + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", prisonName=" + prisonName + "]";
	}
	
	
}
