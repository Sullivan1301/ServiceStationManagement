package com.example.servicestationmanagement.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SaleRequest {
    private int id;
    private Product product;
    private double quantityorAmount;
}
