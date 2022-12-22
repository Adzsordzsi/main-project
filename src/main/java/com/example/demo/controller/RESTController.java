package com.example.demo.controller;


import org.json.JSONObject;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;


@RestController
public class RESTController {


    @CrossOrigin
    @RequestMapping("/")
    public String home(){

        String jsonString = new JSONObject()
                .put("first", "Hello World!")
                .put("second", "Hello my World!")
                .toString();

        return jsonString;
    }

}
