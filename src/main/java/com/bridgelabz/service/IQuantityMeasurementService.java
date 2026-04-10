package com.bridgelabz.service;

import com.bridgelabz.dto.QuantityDTO;
import com.bridgelabz.entity.QuantityMeasurementEntity;

import java.util.List;

public interface IQuantityMeasurementService {

    boolean compare(QuantityDTO q1, QuantityDTO q2);

    double add(QuantityDTO q1, QuantityDTO q2);

    // 🔥 NEW (UC16)
    void saveResult(QuantityMeasurementEntity entity);

    List<QuantityMeasurementEntity> getAllResults();
}