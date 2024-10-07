package com.boulder.trail.dto;

import java.time.LocalDate;

public class TrailDTO {

	private int id;
	private String accessName;
	private String accessId;
	private String accessType;
	private String address;
	private String aka;
	private LocalDate dateFrom;
	private LocalDate dateTo;
	private Boolean restroom;
	private Boolean picnic;
	private Boolean fishing;
	private Boolean fee;
	private Boolean bikeRack;
	private Boolean bikeTrail;
	private Boolean grills;
	private String horseTrail;
	private Boolean recycleBin;
	private Boolean dogCompost;
	private Boolean thLeash;
	private Integer dogTube;
	private Integer trashCans;
	private Integer parkingSpace;
	private String adaSurface;
	private Boolean adaFacility;
	private String adaFacilityName;
	private Boolean adaParking;
	private Integer adaParkingNo;
	private Boolean adaToilet;
	private Boolean adaFishing;
	private Boolean adaCamping;
	private Boolean adaPicnic;
	private String trailClassCode;
	private String trailClassName;
	private String trailDifficulty;

	public TrailDTO(int id, String accessName, String accessId, String accessType, String address, String aka,
			LocalDate dateFrom, LocalDate dateTo, Boolean restroom, Boolean picnic, Boolean fishing, Boolean fee,
			Boolean bikeRack, Boolean bikeTrail, Boolean grills, String horseTrail, Boolean recycleBin,
			Boolean dogCompost, Boolean thLeash, Integer dogTube, Integer trashCans, Integer parkingSpace,
			String adaSurface, Boolean adaFacility, String adaFacilityName, Boolean adaParking, Integer adaParkingNo,
			Boolean adaToilet, Boolean adaFishing, Boolean adaCamping, Boolean adaPicnic, String trailClassCode,
			String trailClassName, String trailDifficulty) {
		super();
		this.id = id;
		this.accessName = accessName;
		this.accessId = accessId;
		this.accessType = accessType;
		this.address = address;
		this.aka = aka;
		this.dateFrom = dateFrom;
		this.dateTo = dateTo;
		this.restroom = restroom;
		this.picnic = picnic;
		this.fishing = fishing;
		this.fee = fee;
		this.bikeRack = bikeRack;
		this.bikeTrail = bikeTrail;
		this.grills = grills;
		this.horseTrail = horseTrail;
		this.recycleBin = recycleBin;
		this.dogCompost = dogCompost;
		this.thLeash = thLeash;
		this.dogTube = dogTube;
		this.trashCans = trashCans;
		this.parkingSpace = parkingSpace;
		this.adaSurface = adaSurface;
		this.adaFacility = adaFacility;
		this.adaFacilityName = adaFacilityName;
		this.adaParking = adaParking;
		this.adaParkingNo = adaParkingNo;
		this.adaToilet = adaToilet;
		this.adaFishing = adaFishing;
		this.adaCamping = adaCamping;
		this.adaPicnic = adaPicnic;
		this.trailClassCode = trailClassCode;
		this.trailClassName = trailClassName;
		this.trailDifficulty = trailDifficulty;
	}

	public TrailDTO() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

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

	public String getTrailClassCode() {
		return trailClassCode;
	}

	public void setTrailClassCode(String trailClassCode) {
		this.trailClassCode = trailClassCode;
	}
	
	public String getTrailClassName() {
		return trailClassName;
	}

	public void setTrailClassName(String trailClassName) {
		this.trailClassName = trailClassName;
	}

	public String getTrailDifficulty() {
		return trailDifficulty;
	}

	public void setTrailDifficulty(String trailDifficulty) {
		this.trailDifficulty = trailDifficulty;
	}
	
}
