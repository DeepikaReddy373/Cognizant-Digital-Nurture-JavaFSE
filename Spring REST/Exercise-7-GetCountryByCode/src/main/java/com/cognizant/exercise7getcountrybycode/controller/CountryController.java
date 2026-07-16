package com.cognizant.exercise7getcountrybycode.controller;

import com.cognizant.exercise7getcountrybycode.model.Country;
import org.springframework.web.bind.annotation.*;

@RestController
public class CountryController {

    @GetMapping("/countries/{code}")
    public Country getCountry(@PathVariable String code) {

        if (code.equalsIgnoreCase("IN")) {
            return new Country("IN", "India");
        } else if (code.equalsIgnoreCase("US")) {
            return new Country("US", "United States");
        } else if (code.equalsIgnoreCase("JP")) {
            return new Country("JP", "Japan");
        }

        return new Country(code.toUpperCase(), "Country Not Found");
    }
}