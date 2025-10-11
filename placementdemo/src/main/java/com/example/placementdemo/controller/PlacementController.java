package com.example.placementdemo.controller;

import com.example.placementdemo.entity.Placement;
import com.example.placementdemo.service.PlacementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("c")
@CrossOrigin(origins = "*")
public class PlacementController {

    @Autowired
    private PlacementService placementService;

    @PostMapping
    public Placement createPlacement(@RequestBody Placement placement) {
        return placementService.savePlacement(placement);
    }

    @GetMapping
    public List<Placement> getAllPlacements() {
        return placementService.getAllPlacements();
    }

    @GetMapping("/{id}")
    public Optional<Placement> getPlacementById(@PathVariable Long id) {
        return placementService.getPlacementById(id);
    }

    @PutMapping("/{id}")
    public Placement updatePlacement(@PathVariable Long id, @RequestBody Placement placement) {
        return placementService.updatePlacement(id, placement);
    }

    @DeleteMapping("/{id}")
    public String deletePlacement(@PathVariable Long id) {
        placementService.deletePlacement(id);
        return "Deleted placement with id: " + id;
    }
}
