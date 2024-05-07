package com.example.servicestationmanagement.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Stock {
    private int id;
    private Product product;
    private Station station;
    private double quantity;
    private Instant date;
}
