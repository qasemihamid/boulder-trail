package com.boulder.trail.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.boulder.trail.dto.TrailDTO;
import com.boulder.trail.model.Trail;

public interface TrailRepository extends JpaRepository<Trail, Integer>{
	
	@Query(
			"SELECT new com.boulder.trail.dto.TrailDTO ( " +
			"	t.id, t.accessName, t.accessId, t.accessType, t.address, t.aka, " +
			"	t.dateFrom, t.dateTo, t.restroom, t.picnic, t.fishing, t.fee, " +
			"	t.bikeRack, t.bikeTrail, t.grills, t.horseTrail, t.recycleBin, " +
			"	t.dogCompost, t.thLeash, t.dogTube, t.trashCans, t.parkingSpace, " +
			"	t.adaSurface, t.adaFacility, t.adaFacilityName, t.adaParking, t.adaParkingNo, " +
			"	t.adaToilet, t.adaFishing, t.adaCamping, t.adaPicnic, tc.classCode, tc.className, td.difficulty) " + 
			"FROM Trail t " +
			"JOIN TrailClass tc ON tc.id = t.trailClass.id " +
			"JOIN TrailDifficulty td ON td.id = t.trailDifficulty.id " +
			"WHERE (:trailClassId IS NULL OR t.trailClass.id = :trailClassId) " +
			"AND (:adaTrailDifficultyId IS NULL OR t.trailDifficulty.id = :adaTrailDifficultyId) " +
			"AND (:address IS NULL OR t.address LIKE %:address%) " +
			"AND (:accessName IS NULL OR t.accessName LIKE %:accessName%) " +
			"AND (:hasRestroom IS NULL OR t.restroom = :hasRestroom) " +
			"AND (:hasPicnic IS NULL OR t.picnic = :hasPicnic) " +
			"AND (:hasFishing IS NULL OR t.fishing = :hasFishing) "
			)
	List<TrailDTO> getAllTrails(
		@Param("address") String address,
		@Param("accessName") String accessName,
		@Param("trailClassId") Integer trailClassId,
		@Param("adaTrailDifficultyId") Integer adaTrailDifficultyId,
		@Param("hasRestroom") Boolean hasRestroom,
		@Param("hasPicnic") Boolean hasPicnic,
		@Param("hasFishing") Boolean hasFishing);
}
