package com.boulder.trail.dto;

public class TrailDifficultyDTO {

	private int id;
	private String difficulty;
	private String description;
	
	public TrailDifficultyDTO(int id, String difficulty, String description) {
		super();
		this.id = id;
		this.difficulty = difficulty;
		this.description = description;
	}
	
	public TrailDifficultyDTO() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

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
	
}
