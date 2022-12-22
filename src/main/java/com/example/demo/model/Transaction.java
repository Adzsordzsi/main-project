package com.example.demo.model;

import lombok.Data;

@Data
public class Transaction {

    private Long id;
    private String name;
    private String description;
    private Double amount;
}
