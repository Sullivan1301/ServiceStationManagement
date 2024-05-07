package com.example.servicestationmanagement.models;

import lombok.Data;

import java.time.Instant;

@Data
public class Stock {
    private int id;
    private Product product;
    private Station station;
    private double quantity;
    private Instant date;
}
