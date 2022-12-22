package com.example.demo.model;
import lombok.Data;


import java.util.List;

@Data
public class User {
    private String username="me";
    private String password;
    private String email;
    private Long id;
    private List<Dashboard> dashboards;
    private List<Transaction> transactions;

    public User(String  username, String password, String email, Long id, List<Dashboard> dashboards, List<Transaction> transactions) {
    }

    public User() {

    }
}
