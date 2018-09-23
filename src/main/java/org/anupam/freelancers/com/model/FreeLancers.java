package org.anupam.freelancers.com.model;

import java.util.Map;

public class FreeLancers {

	long id;	
	String name;
	String surname;
	public enum ProjectStatus {Active,Expired}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public FreeLancers() {
		super();
		// TODO Auto-generated constructor stub
	}
	public FreeLancers(long id, String name, String surname, String emailId, Map<Long, ProjectStatus> project) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.emailId = emailId;
		this.project = project;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public Map<Long, ProjectStatus> getProject() {
		return project;
	}
	public void setProject(Map<Long, ProjectStatus> project) {
		this.project = project;
	}
	String emailId;
	Map<Long, ProjectStatus> project;
}
