package com.bridgelabz.entity;

public class QuantityMeasurementEntity {

    private Long id;
    private double firstValue;
    private String firstUnit;
    private double secondValue;
    private String secondUnit;
    private String operation;
    private double resultValue;
    private String resultUnit;

    // getters & setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getFirstValue() {
        return firstValue;
    }

    public void setFirstValue(double firstValue) {
        this.firstValue = firstValue;
    }

    public String getFirstUnit() {
        return firstUnit;
    }

    public void setFirstUnit(String firstUnit) {
        this.firstUnit = firstUnit;
    }

    public double getSecondValue() {
        return secondValue;
    }

    public void setSecondValue(double secondValue) {
        this.secondValue = secondValue;
    }

    public String getSecondUnit() {
        return secondUnit;
    }

    public void setSecondUnit(String secondUnit) {
        this.secondUnit = secondUnit;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public double getResultValue() {
        return resultValue;
    }

    public void setResultValue(double resultValue) {
        this.resultValue = resultValue;
    }

    public String getResultUnit() {
        return resultUnit;
    }

    public void setResultUnit(String resultUnit) {
        this.resultUnit = resultUnit;
    }
}