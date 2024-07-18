package com.hibernate.prisoners.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Healthcare {
	
	@Id
	private int requestId;
	
	private int prisonersId;
	
	private String healthIssue;
	
	private String requestStatus;

	public Healthcare() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Healthcare(int requestId, int prisonersId, String healthIssue, String requestStatus) {
		this.requestId = requestId;
		this.prisonersId = prisonersId;
		this.healthIssue = healthIssue;
		this.requestStatus = requestStatus;
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

	public String getHealthIssue() {
		return healthIssue;
	}

	public void setHealthIssue(String healthIssue) {
		this.healthIssue = healthIssue;
	}

	public String getRequestStatus() {
		return requestStatus;
	}

	public void setRequestStatus(String requestStatus) {
		this.requestStatus = requestStatus;
	}

	@Override
	public String toString() {
		return "Healthcare [requestId=" + requestId + ", prisonersId=" + prisonersId + ", healthIssue=" + healthIssue
				+ ", requestStatus=" + requestStatus + "]";
	}
	
	
	
	

}
