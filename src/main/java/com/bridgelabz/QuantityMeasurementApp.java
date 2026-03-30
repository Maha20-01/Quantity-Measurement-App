package com.bridgelabz;

import com.bridgelabz.controller.QuantityMeasurementController;
import com.bridgelabz.dto.QuantityDTO;
import com.bridgelabz.repository.QuantityMeasurementCacheRepository;
import com.bridgelabz.service.QuantityMeasurementServiceImpl;

public class QuantityMeasurementApp {

    public static void main(String[] args) {

        var repository = QuantityMeasurementCacheRepository.getInstance();
        var service = new QuantityMeasurementServiceImpl(repository);
        var controller = new QuantityMeasurementController(service);

        QuantityDTO l1 = new QuantityDTO(10.0, "FEET");
        QuantityDTO l2 = new QuantityDTO(6.0, "INCHES");

        controller.add(l1, l2);
        controller.compare(l1, l2);
    }
}