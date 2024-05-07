package com.example.servicestationmanagement.models;

import lombok.Data;

@Data
public class Station {
    private int id;
    private String name;
    private double essence;
    private double diesel;
    private double petrole;
}
