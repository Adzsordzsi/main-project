package com.example.demo.model;

import lombok.Data;

import java.util.List;

@Data
public class Dashboard {

    private Long id;
    private List<Transaction> transactions;


}
