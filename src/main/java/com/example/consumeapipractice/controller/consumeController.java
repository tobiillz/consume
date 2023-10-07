package com.example.consumeapipractice.controller;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;
import java.util.Map;


//@Component
@RestController
public class consumeController {

    @Autowired
    private RestTemplate restTemplate;
    private static String url =  "https://jsonplaceholder.typicode.com/posts";

    @GetMapping("/posts")
    public List<Object> getPosts(){
        Object[] posts = restTemplate.getForObject(url,Object[].class);
        return Arrays.asList(posts);
    }


}
