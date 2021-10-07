package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class kontroler {

    @GetMapping("/mojaFunkcja/{text}")
    @ResponseBody
    public String reverseString(@PathVariable String text) {

        return new StringBuilder().append(text).reverse().toString();
    }

}
