package com.bridgelabz.repository;

import java.util.List;
import com.bridgelabz.entity.QuantityMeasurementEntity;
public interface IQuantityMeasurementRepository {

    void save(QuantityMeasurementEntity entity);

    List<QuantityMeasurementEntity> findAll();
}