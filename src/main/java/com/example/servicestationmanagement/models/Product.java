package com.example.servicestationmanagement.models;

import lombok.*;

@Data
public class Product {
    private int id;
    private String name;
    private double unitPrice;
    private double evaporationRate;
}
