package com.hibernate.prisoners.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Rehabilitation {

	@Id
	private int rehabCourseId;
	
	private String courseName;
	
	private String description;
	
	private String startDate;
	
	private String endDate;

	public Rehabilitation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Rehabilitation(int rehabCourseId, String courseName, String description, String startDate, String endDate) {
		this.rehabCourseId = rehabCourseId;
		this.courseName = courseName;
		this.description = description;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public int getRehabCourseId() {
		return rehabCourseId;
	}

	public void setRehabCourseId(int rehabCourseId) {
		this.rehabCourseId = rehabCourseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	@Override
	public String toString() {
		return "Rehabilitation [rehabCourseId=" + rehabCourseId + ", courseName=" + courseName + ", description="
				+ description + ", startDate=" + startDate + ", endDate=" + endDate + "]";
	}
	
	
}
