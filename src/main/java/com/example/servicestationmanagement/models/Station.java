package com.example.servicestationmanagement.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.stream.Location;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Station {
    private int id;
    private String name;
    private String quarter;
    private int capacity;
    private List<ProductTemplate> products;
}
