package com.bridgelabz.controller;

import com.bridgelabz.dto.QuantityDTO;
import com.bridgelabz.entity.QuantityMeasurementEntity;
import com.bridgelabz.service.IQuantityMeasurementService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/quantity")
public class QuantityMeasurementController {

    @Autowired
    private IQuantityMeasurementService service;

    // 🔥 ADD API
    @PostMapping("/add")
    public double add(@RequestBody List<QuantityDTO> quantities) {
        return service.add(quantities.get(0), quantities.get(1));
    }

    // 🔥 COMPARE API
    @PostMapping("/compare")
    public boolean compare(@RequestBody List<QuantityDTO> quantities) {
        return service.compare(quantities.get(0), quantities.get(1));
    }

    // 🔥 SAVE API
    @PostMapping("/save")
    public ResponseEntity<String> save(@RequestBody QuantityMeasurementEntity entity) {
        service.saveResult(entity);
        return ResponseEntity.ok("Saved Successfully");
    }

    // 🔥 GET ALL
    @GetMapping("/all")
    public List<QuantityMeasurementEntity> getAll() {
        return service.getAllResults();
    }
}