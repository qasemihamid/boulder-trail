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
@Table(name = "trail_difficulty")
public class TrailDifficulty {
	
	@Id
	@SequenceGenerator(name = "seq_trail_difficulty", sequenceName = "seq_trail_difficulty", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_trail_difficulty")
	@Column(name = "difficulty_id")
	private int id;
	
	@Column(name = "difficulty")
	private String difficulty;
	
	@Column(name = "description")
	private String description;
	
	@OneToMany
	@JoinColumn(name = "ada_trail_difficulty_id")
	private List<Trail> trails;

	public String getDifficulty() {
		return difficulty;
	}

	public void setDifficulty(String difficulty) {
		this.difficulty = difficulty;
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
