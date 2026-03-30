package com.bridgelabz.controller;

import com.bridgelabz.dto.QuantityDTO;
import com.bridgelabz.service.IQuantityMeasurementService;

public class QuantityMeasurementController {

    private IQuantityMeasurementService service;

    public QuantityMeasurementController(IQuantityMeasurementService service) {
        this.service = service;
    }

    public void compare(QuantityDTO q1, QuantityDTO q2) {
        System.out.println(service.compare(q1, q2));
    }

    public void add(QuantityDTO q1, QuantityDTO q2) {
        System.out.println(service.add(q1, q2));
    }
}