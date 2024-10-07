package com.boulder.trail.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.boulder.trail.dto.TrailDTO;
import com.boulder.trail.service.TrailService;
import com.boulder.trail.service.TrailService.GetTrailListInputDto;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class TrailController {
	
	@Autowired
	private TrailService trailService;
	
	// get the list of Trails using filter parameters
	@PostMapping(path = "/getAllTrails")
	public ResponseEntity<?> getAllTrails(@RequestBody GetTrailListInputDto input){
		
		try {
			List<TrailDTO> trails = trailService.getAllTrails(input);
			return ResponseEntity.ok(trails);
		} catch (IllegalArgumentException e) {
			return ResponseEntity.badRequest().body("invalid input: " + e.getMessage());
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("An unexpected error occurred. Please try again.");
		}
		
		
		
	}
	

}
