package com.example.servicestationmanagement.controllers;

import com.example.servicestationmanagement.services.SaleService;
import com.example.servicestationmanagement.models.SaleRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class saleController {
    private final SaleService saleService;

    @Autowired
    public saleController(SaleService saleService) {
        this.saleService = saleService;
    }


    @PostMapping("/sellByLiters")
    public double sellByLiters(@RequestBody SaleRequest request) {
        double totalAmount = saleService.sellByLiters(request.getProduct(), request.getQuantityorAmount());

        return totalAmount;
    }

    @PostMapping("/sellByAMount")
    public double sellByAmount(@RequestBody SaleRequest request) {
        double soldQuantity = saleService.sellByAmount(request.getProduct(), request.getQuantityorAmount());

        return soldQuantity;
    }
}
