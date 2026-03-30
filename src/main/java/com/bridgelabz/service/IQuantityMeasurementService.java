package com.bridgelabz.service;

import com.bridgelabz.dto.QuantityDTO;

public interface IQuantityMeasurementService {
    boolean compare(QuantityDTO q1, QuantityDTO q2);
    double add(QuantityDTO q1, QuantityDTO q2);
}