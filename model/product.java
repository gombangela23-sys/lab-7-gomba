package com.example.productapi.model;

import lombok.AllArgsConstructor;
import lombokData;
import lombokNoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Product {
    private Long id;
    private String name;
    private Double price;
}
