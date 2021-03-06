package com.example.errorhandling.web;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class ProductController {

    //Here we can see right expose of exception
    @GetMapping("/products/{id}/details")
    public String showProductDetails(@PathVariable("id") Long id){
        throw new ObjectNotFoundException(id);
    }



}
