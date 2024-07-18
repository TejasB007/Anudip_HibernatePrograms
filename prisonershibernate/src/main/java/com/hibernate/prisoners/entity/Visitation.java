package com.hibernate.prisoners.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Visitation {

	@Id
	private int requestId;
	
	private int prisonersId;
	
	private String visitorName;
	
	private String visitDate;

	public Visitation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Visitation(int requestId, int prisonersId, String visitorName, String visitDate) {
		this.requestId = requestId;
		this.prisonersId = prisonersId;
		this.visitorName = visitorName;
		this.visitDate = visitDate;
	}

	public int getRequestId() {
		return requestId;
	}

	public void setRequestId(int requestId) {
		this.requestId = requestId;
	}

	public int getPrisonersId() {
		return prisonersId;
	}

	public void setPrisonersId(int prisonersId) {
		this.prisonersId = prisonersId;
	}

	public String getVisitorName() {
		return visitorName;
	}

	public void setVisitorName(String visitorName) {
		this.visitorName = visitorName;
	}

	public String getVisitDate() {
		return visitDate;
	}

	public void setVisitDate(String visitDate) {
		this.visitDate = visitDate;
	}

	@Override
	public String toString() {
		return "Visitation [requestId=" + requestId + ", prisonersId=" + prisonersId + ", visitorName=" + visitorName
				+ ", visitDate=" + visitDate + "]";
	}
	
	
}
