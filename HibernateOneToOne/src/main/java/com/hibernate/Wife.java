package com.hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="wife_details")
public class Wife {
	
	@Id
	private int wid;
	@Column(name="wife_name")
	private String wName;
	@OneToOne
	private Husband husband;

	public Wife() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Wife(int wid, String wName, Husband husband) {
		this.wid = wid;
		this.wName = wName;
		this.husband = husband;
	}

	public int getWid() {
		return wid;
	}

	public void setWid(int wid) {
		this.wid = wid;
	}

	public String getwName() {
		return wName;
	}

	public void setwName(String wName) {
		this.wName = wName;
	}

	public Husband getHusband() {
		return husband;
	}

	public void setHusband(Husband husband) {
		this.husband = husband;
	}

	@Override
	public String toString() {
		return "Wife [wid=" + wid + ", wName=" + wName + ", husband=" + husband + "]";
	}
	
	

}
