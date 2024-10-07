package com.boulder.trail.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boulder.trail.dto.TrailDTO;
import com.boulder.trail.repository.TrailRepository;

@Service
public class TrailService {
	
	public static class GetTrailListInputDto{
		public String address;
		public String accessName;
		public Integer trailClassId;
		public Integer adaTrailDifficultyId;
		public boolean hasRestroom;
		public boolean hasPicnic;
		public boolean hasFishing;
	}
	
	@Autowired
	private TrailRepository trailRepository;
	
	public List<TrailDTO> getAllTrails(GetTrailListInputDto input){
		return trailRepository.getAllTrails(
				input.address.equals("") ? null : input.address, 
				input.accessName.equals("") ? null : input.accessName, 
				input.trailClassId,
				input.adaTrailDifficultyId, 
				input.hasRestroom, 
				input.hasPicnic, 
				input.hasFishing);
	}
}
