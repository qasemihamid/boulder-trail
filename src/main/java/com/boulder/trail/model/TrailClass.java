package com.boulder.trail.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "trail_class")
public class TrailClass {
	
	@Id
	@SequenceGenerator(name = "seq_class_id", sequenceName = "seq_class_id", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_class_id")
	@Column(name = "class_id")
	private int id;
	
	@Column(name = "class_code")
	private String classCode;
	
	@Column(name = "class_name")
	private String className;
	
	@Column(name = "description")
	private String description;
	
	@OneToMany
	@JoinColumn(name = "trail_class_id")
	private List<Trail> trails;

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

	public List<Trail> getTrails() {
		return trails;
	}

	public void setTrails(List<Trail> trails) {
		this.trails = trails;
	}

	public int getId() {
		return id;
	}
}
