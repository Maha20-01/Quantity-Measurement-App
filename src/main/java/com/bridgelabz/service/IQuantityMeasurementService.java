package com.bridgelabz.service;

import com.bridgelabz.dto.QuantityRequestDTO;
import com.bridgelabz.dto.QuantityResponseDTO;

import java.util.List;

public interface IQuantityMeasurementService {

    boolean compare(QuantityRequestDTO request);

    QuantityResponseDTO add(QuantityRequestDTO request);

    List<QuantityResponseDTO> getAllResults();
}