package com.example.servicestationmanagement.models;

import lombok.Data;

import javax.xml.stream.Location;
import java.util.List;

@Data
public class Station {
    private int id;
    private String name;
    private String quarter;
    private int capacity;
    private List<ProductTemplate> products;
}
