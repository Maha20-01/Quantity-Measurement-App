package com.bridgelabz.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "quantity_measurements")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class QuantityMeasurementEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private double firstValue;

    @Column(nullable = false)
    private String firstUnit;

    @Column(nullable = false)
    private double secondValue;

    @Column(nullable = false)
    private String secondUnit;

    @Column(nullable = false)
    private String operation;

    @Column(nullable = false)
    private double resultValue;

    @Column(nullable = false)
    private String resultUnit;
}