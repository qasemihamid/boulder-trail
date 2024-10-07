package com.boulder.trail.model;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "trail")
public class Trail {
	
	@Id
	@SequenceGenerator(name = "seq_trail_id", sequenceName = "seq_trail_id", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_trail_id")
	@Column(name = "trail_id")
	private int id;
	
	@Column(name = "access_name")
	private String accessName;
	
	@Column(name = "access_id")
	private String accessId;
	
	@Column(name = "access_type")
	private String accessType;
	
	@Column(name = "address")
	private String address;

	@Column(name = "aka")
	private String aka;

	@Column(name = "date_from")
	private LocalDate dateFrom;
	
	@Column(name = "date_to")
	private LocalDate dateTo;

	@Column(name = "restroom")
	private Boolean restroom;

	@Column(name = "picnic")
	private Boolean picnic;

	@Column(name = "fishing")
	private Boolean fishing;

	@Column(name = "fee")
	private Boolean fee;

	@Column(name = "bike_rack")
	private Boolean bikeRack;

	@Column(name = "bike_trail")
	private Boolean bikeTrail;
	
	@Column(name = "grills")
	private Boolean grills;
	
	@Column(name = "horse_trail")
	private String horseTrail;
	
	@Column(name = "recycle_bin")
	private Boolean recycleBin;
	
	@Column(name = "dog_compost")
	private Boolean dogCompost;
	
	@Column(name = "th_leash")
	private Boolean thLeash;

	@Column(name = "dog_tube")
	private Integer dogTube;
	
	@Column(name = "trash_cans")
	private Integer trashCans;
	
	@Column(name = "parking_space")
	private Integer parkingSpace;
	
	@Column(name = "ada_surface")
	private String adaSurface;
	
	@Column(name = "ada_facility")
	private Boolean adaFacility;
	
	@Column(name = "ada_facility_name")
	private String adaFacilityName;
	
	@Column(name = "ada_parking")
	private Boolean adaParking;
	
	@Column(name = "ada_parking_no")
	private Integer adaParkingNo;
	
	@Column(name = "ada_toilet")
	private Boolean adaToilet;
	
	@Column(name = "ada_fishing")
	private Boolean adaFishing;
	
	@Column(name = "ada_camping")
	private Boolean adaCamping;
	
	@Column(name = "ada_picnic")
	private Boolean adaPicnic;
	
	@ManyToOne
	@JsonBackReference
	@JoinColumn(name = "trail_class_id", referencedColumnName = "class_id")
	private TrailClass trailClass;
	
	@ManyToOne
	@JsonBackReference
	@JoinColumn(name = "ada_trail_difficulty_id", referencedColumnName = "difficulty_id")
	private TrailDifficulty trailDifficulty;

	public String getAccessName() {
		return accessName;
	}

	public void setAccessName(String accessName) {
		this.accessName = accessName;
	}

	public String getAccessId() {
		return accessId;
	}

	public void setAccessId(String accessId) {
		this.accessId = accessId;
	}

	public String getAccessType() {
		return accessType;
	}

	public void setAccessType(String accessType) {
		this.accessType = accessType;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAka() {
		return aka;
	}

	public void setAka(String aka) {
		this.aka = aka;
	}

	public LocalDate getDateFrom() {
		return dateFrom;
	}

	public void setDateFrom(LocalDate dateFrom) {
		this.dateFrom = dateFrom;
	}

	public LocalDate getDateTo() {
		return dateTo;
	}

	public void setDateTo(LocalDate dateTo) {
		this.dateTo = dateTo;
	}

	public Boolean getRestroom() {
		return restroom;
	}

	public void setRestroom(Boolean restroom) {
		this.restroom = restroom;
	}

	public Boolean getPicnic() {
		return picnic;
	}

	public void setPicnic(Boolean picnic) {
		this.picnic = picnic;
	}

	public Boolean getFishing() {
		return fishing;
	}

	public void setFishing(Boolean fishing) {
		this.fishing = fishing;
	}

	public Boolean getFee() {
		return fee;
	}

	public void setFee(Boolean fee) {
		this.fee = fee;
	}

	public Boolean getBikeRack() {
		return bikeRack;
	}

	public void setBikeRack(Boolean bikeRack) {
		this.bikeRack = bikeRack;
	}

	public Boolean getBikeTrail() {
		return bikeTrail;
	}

	public void setBikeTrail(Boolean bikeTrail) {
		this.bikeTrail = bikeTrail;
	}

	public Boolean getGrills() {
		return grills;
	}

	public void setGrills(Boolean grills) {
		this.grills = grills;
	}

	public String getHorseTrail() {
		return horseTrail;
	}

	public void setHorseTrail(String horseTrail) {
		this.horseTrail = horseTrail;
	}

	public Boolean getRecycleBin() {
		return recycleBin;
	}

	public void setRecycleBin(Boolean recycleBin) {
		this.recycleBin = recycleBin;
	}

	public Boolean getDogCompost() {
		return dogCompost;
	}

	public void setDogCompost(Boolean dogCompost) {
		this.dogCompost = dogCompost;
	}

	public Boolean getThLeash() {
		return thLeash;
	}

	public void setThLeash(Boolean thLeash) {
		this.thLeash = thLeash;
	}

	public Integer getDogTube() {
		return dogTube;
	}

	public void setDogTube(Integer dogTube) {
		this.dogTube = dogTube;
	}

	public Integer getTrashCans() {
		return trashCans;
	}

	public void setTrashCans(Integer trashCans) {
		this.trashCans = trashCans;
	}

	public Integer getParkingSpace() {
		return parkingSpace;
	}

	public void setParkingSpace(Integer parkingSpace) {
		this.parkingSpace = parkingSpace;
	}

	public String getAdaSurface() {
		return adaSurface;
	}

	public void setAdaSurface(String adaSurface) {
		this.adaSurface = adaSurface;
	}

	public Boolean getAdaFacility() {
		return adaFacility;
	}

	public void setAdaFacility(Boolean adaFacility) {
		this.adaFacility = adaFacility;
	}

	public String getAdaFacilityName() {
		return adaFacilityName;
	}

	public void setAdaFacilityName(String adaFacilityName) {
		this.adaFacilityName = adaFacilityName;
	}

	public Boolean getAdaParking() {
		return adaParking;
	}

	public void setAdaParking(Boolean adaParking) {
		this.adaParking = adaParking;
	}

	public Integer getAdaParkingNo() {
		return adaParkingNo;
	}

	public void setAdaParkingNo(Integer adaParkingNo) {
		this.adaParkingNo = adaParkingNo;
	}

	public Boolean getAdaToilet() {
		return adaToilet;
	}

	public void setAdaToilet(Boolean adaToilet) {
		this.adaToilet = adaToilet;
	}

	public Boolean getAdaFishing() {
		return adaFishing;
	}

	public void setAdaFishing(Boolean adaFishing) {
		this.adaFishing = adaFishing;
	}

	public Boolean getAdaCamping() {
		return adaCamping;
	}

	public void setAdaCamping(Boolean adaCamping) {
		this.adaCamping = adaCamping;
	}

	public Boolean getAdaPicnic() {
		return adaPicnic;
	}

	public void setAdaPicnic(Boolean adaPicnic) {
		this.adaPicnic = adaPicnic;
	}

	public TrailClass getTrailClass() {
		return trailClass;
	}

	public void setTrailClass(TrailClass trailClass) {
		this.trailClass = trailClass;
	}

	public TrailDifficulty getTrailDifficulty() {
		return trailDifficulty;
	}

	public void setTrailDifficulty(TrailDifficulty trailDifficulty) {
		this.trailDifficulty = trailDifficulty;
	}
	
	public int getId() {
		return id;
	}
	
}
