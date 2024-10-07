package com.boulder.trail.dto;

public class TrailClassDTO {

	private int id;
	private String classCode;
	private String className;
	private String description;
	
	public TrailClassDTO(int id, String classCode, String className, String description) {
		super();
		this.id = id;
		this.classCode = classCode;
		this.className = className;
		this.description = description;
	}
	
	public TrailClassDTO() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getClassCode() {
		return classCode;
	}

	public void setClassCode(String classCode) {
		this.classCode = classCode;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
}
