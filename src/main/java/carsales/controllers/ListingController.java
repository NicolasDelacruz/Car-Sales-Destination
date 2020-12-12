package carsales.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ListingController {

    @GetMapping("/getListing")
    public String getListing(){
        return "Test return";
    }
}
