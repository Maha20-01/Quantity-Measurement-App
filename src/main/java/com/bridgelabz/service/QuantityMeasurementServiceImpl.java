package com.bridgelabz.service;

import com.bridgelabz.LengthUnit;
import com.bridgelabz.Quantity;
import com.bridgelabz.dto.QuantityDTO;
import com.bridgelabz.entity.QuantityMeasurementEntity;
import com.bridgelabz.repository.IQuantityMeasurementRepository;

public class QuantityMeasurementServiceImpl implements IQuantityMeasurementService {

    private IQuantityMeasurementRepository repository;

    public QuantityMeasurementServiceImpl(IQuantityMeasurementRepository repository) {
        this.repository = repository;
    }

    @Override
    public boolean compare(QuantityDTO q1, QuantityDTO q2) {

        LengthUnit unit1 = LengthUnit.valueOf(q1.getUnit());
        LengthUnit unit2 = LengthUnit.valueOf(q2.getUnit());

        Quantity<LengthUnit> qty1 = new Quantity<>(q1.getValue(), unit1);
        Quantity<LengthUnit> qty2 = new Quantity<>(q2.getValue(), unit2);

        return qty1.equals(qty2);
    }

    @Override
    public double add(QuantityDTO q1, QuantityDTO q2) {

        LengthUnit unit1 = LengthUnit.valueOf(q1.getUnit());
        LengthUnit unit2 = LengthUnit.valueOf(q2.getUnit());

        Quantity<LengthUnit> qty1 = new Quantity<>(q1.getValue(), unit1);
        Quantity<LengthUnit> qty2 = new Quantity<>(q2.getValue(), unit2);

        Quantity<LengthUnit> result = qty1.add(qty2);

        return result.getValue();
    }
    }
