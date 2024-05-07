package com.example.servicestationmanagement.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ProductTemplate {
    private int id;
    private FuelType name;
    private double unitPrice;
    private int rateEvaporation;
}
