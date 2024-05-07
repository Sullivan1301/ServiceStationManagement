package com.example.servicestationmanagement.models;

import lombok.*;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Product {
    private int id;
    private Station station;
    private ProductTemplate product;
}
