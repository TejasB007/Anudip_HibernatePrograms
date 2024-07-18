package com.hibernate.prisoners.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class LegalAdvice {
	
	@Id
	private int requestId;
	
	private int prisonersId;
	
	private String requestType;
	
	private String requestStatus;

	public LegalAdvice() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LegalAdvice(int requestId, int prisonersId, String requestType, String requestStatus) {
		this.requestId = requestId;
		this.prisonersId = prisonersId;
		this.requestType = requestType;
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

	public String getRequestType() {
		return requestType;
	}

	public void setRequestType(String requestType) {
		this.requestType = requestType;
	}

	public String getRequestStatus() {
		return requestStatus;
	}

	public void setRequestStatus(String requestStatus) {
		this.requestStatus = requestStatus;
	}

	@Override
	public String toString() {
		return "LegalAdvice [requestId=" + requestId + ", prisonersId=" + prisonersId + ", requestType=" + requestType
				+ ", requestStatus=" + requestStatus + "]";
	}
	
	

}
