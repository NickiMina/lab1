package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class kontroler {

    @GetMapping("/mojaFunkcja")
    public String mojaFunkcja(){

        String text1 = new StringBuilder().append("napis").reverse().toString();
        return text1;
    }

}
