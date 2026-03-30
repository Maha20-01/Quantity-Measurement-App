package com.bridgelabz.model;

import com.bridgelabz.Quantity;
import com.bridgelabz.LengthUnit;

public class QuantityModel {

    private Quantity<LengthUnit> quantity;

    public QuantityModel(double value, String unit) {

        LengthUnit unitEnum = LengthUnit.valueOf(unit); // 🔥 FIX

        this.quantity = new Quantity<>(value, unitEnum);
    }

    public Quantity<LengthUnit> getQuantity() {
        return quantity;
    }
}