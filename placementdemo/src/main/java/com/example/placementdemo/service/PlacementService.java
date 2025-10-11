package com.example.placementdemo.service;

import com.example.placementdemo.entity.Placement;
import com.example.placementdemo.repository.PlacementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PlacementService {

    @Autowired
    private PlacementRepository placementRepository;

    public Placement savePlacement(Placement placement) {
        return placementRepository.save(placement);
    }

    public List<Placement> getAllPlacements() {
        return placementRepository.findAll();
    }

    public Optional<Placement> getPlacementById(Long id) {
        return placementRepository.findById(id);
    }

    public Placement updatePlacement(Long id, Placement updatedPlacement) {
        return placementRepository.findById(id).map(placement -> {
            placement.setName(updatedPlacement.getName());
            placement.setCollege(updatedPlacement.getCollege());
            placement.setDate(updatedPlacement.getDate());
            placement.setQualification(updatedPlacement.getQualification());
            placement.setYear(updatedPlacement.getYear());
            return placementRepository.save(placement);
        }).orElse(null);
    }

    public void deletePlacement(Long id) {
        placementRepository.deleteById(id);
    }
}
