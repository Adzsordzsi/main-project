package com.example.demo.controller;

import org.json.JSONObject;

public class TransactionManager {


    public static String sendString(){

        String jsonString = new JSONObject()
                .put("first", "Hello World!")
                .put("second", "Hello my World!")
                .put("third", new JSONObject().put("key1", "value1"))
                .toString();

        return jsonString;

    }
}