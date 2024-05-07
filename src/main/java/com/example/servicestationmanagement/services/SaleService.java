package com.example.servicestationmanagement.services;

import com.example.servicestationmanagement.models.Product;
import org.springframework.stereotype.Service;

@Service
public class SaleService {

    public double sellByLiters(Product product, double quantity) {
       double unitPrice = product.getProduct().getUnitPrice();
       double totalPrice = quantity * unitPrice;

       double newQuantity = product.getStock().getQuantity() - quantity;
       product.getStock().setQuantity(newQuantity);

       return totalPrice;
    }

    public double sellByAmount(Product product, double amount) {
        double unitPrice = product.getProduct().getUnitPrice();
        double quantity = amount / unitPrice;

        double newQuantity = product.getStock().getQuantity() - quantity;
        product.getStock().setQuantity(newQuantity);

        return quantity;
    }
}
