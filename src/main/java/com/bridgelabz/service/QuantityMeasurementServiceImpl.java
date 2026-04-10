package com.bridgelabz.service;

import com.bridgelabz.LengthUnit;
import com.bridgelabz.Quantity;
import com.bridgelabz.dto.QuantityDTO;
import com.bridgelabz.entity.QuantityMeasurementEntity;
import com.bridgelabz.repository.IQuantityMeasurementRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuantityMeasurementServiceImpl implements IQuantityMeasurementService {

    @Autowired
    private IQuantityMeasurementRepository repository;

    @Override
    public boolean compare(QuantityDTO q1, QuantityDTO q2) {

        LengthUnit unit1 = LengthUnit.valueOf(q1.getUnit());
        LengthUnit unit2 = LengthUnit.valueOf(q2.getUnit());

        Quantity<LengthUnit> qty1 = new Quantity<>(q1.getValue(), unit1);
        Quantity<LengthUnit> qty2 = new Quantity<>(q2.getValue(), unit2);

        boolean result = qty1.equals(qty2);

        QuantityMeasurementEntity entity = new QuantityMeasurementEntity();
        entity.setFirstValue(q1.getValue());
        entity.setFirstUnit(q1.getUnit());
        entity.setSecondValue(q2.getValue());
        entity.setSecondUnit(q2.getUnit());
        entity.setOperation("COMPARE");
        entity.setResultValue(result ? 1 : 0);
        entity.setResultUnit("BOOLEAN");

        repository.save(entity);

        return result;
    }

    @Override
    public double add(QuantityDTO q1, QuantityDTO q2) {

        LengthUnit unit1 = LengthUnit.valueOf(q1.getUnit());
        LengthUnit unit2 = LengthUnit.valueOf(q2.getUnit());

        Quantity<LengthUnit> qty1 = new Quantity<>(q1.getValue(), unit1);
        Quantity<LengthUnit> qty2 = new Quantity<>(q2.getValue(), unit2);

        Quantity<LengthUnit> result = qty1.add(qty2);

        double resultValue = result.getValue();

        QuantityMeasurementEntity entity = new QuantityMeasurementEntity();
        entity.setFirstValue(q1.getValue());
        entity.setFirstUnit(q1.getUnit());
        entity.setSecondValue(q2.getValue());
        entity.setSecondUnit(q2.getUnit());
        entity.setOperation("ADD");
        entity.setResultValue(resultValue);
        entity.setResultUnit(q1.getUnit());

        repository.save(entity);

        return resultValue;
    }

    @Override
    public List<QuantityMeasurementEntity> getAllResults() {
        return repository.findAll();
    }
    @Override
    public void saveResult(QuantityMeasurementEntity entity) {
        repository.save(entity);
    }
}