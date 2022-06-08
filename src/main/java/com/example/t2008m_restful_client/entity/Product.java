package com.example.t2008m_restful_client.entity;

import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Product {
    private int id;
    private String name;
    private double price;
}
