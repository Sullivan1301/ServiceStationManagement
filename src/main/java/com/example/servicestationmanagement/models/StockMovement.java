package com.example.servicestationmanagement.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StockMovement {
    private int id;
    private Stock stock;
    private FuelType product;
    private Float quantity;
    private MovementType movementType;
    private Instant movementTimeDate;
}
