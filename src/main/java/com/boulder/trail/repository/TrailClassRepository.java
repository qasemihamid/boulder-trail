package com.boulder.trail.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boulder.trail.model.TrailClass;

public interface TrailClassRepository extends JpaRepository<TrailClass, Integer> {
}
