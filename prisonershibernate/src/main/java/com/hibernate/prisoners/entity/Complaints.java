package com.hibernate.prisoners.entity;

import javax.persistence.Entity;

@Entity
public class Complaints {
	
	private int complaintId;
	
	private int prisonersId;
	
	private String complaintDesc;

	public Complaints() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Complaints(int complaintId, int prisonersId, String complaintDesc) {
		this.complaintId = complaintId;
		this.prisonersId = prisonersId;
		this.complaintDesc = complaintDesc;
	}

	public int getComplaintId() {
		return complaintId;
	}

	public void setComplaintId(int complaintId) {
		this.complaintId = complaintId;
	}

	public int getPrisonersId() {
		return prisonersId;
	}

	public void setPrisonersId(int prisonersId) {
		this.prisonersId = prisonersId;
	}

	public String getComplaintDesc() {
		return complaintDesc;
	}

	public void setComplaintDesc(String complaintDesc) {
		this.complaintDesc = complaintDesc;
	}

	@Override
	public String toString() {
		return "Complaints [complaintId=" + complaintId + ", prisonersId=" + prisonersId + ", complaintDesc="
				+ complaintDesc + "]";
	}
	
	

}
