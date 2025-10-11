package com.example.placementdemo.repository;

import com.example.placementdemo.entity.Placement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlacementRepository extends JpaRepository<Placement, Long> {
}
