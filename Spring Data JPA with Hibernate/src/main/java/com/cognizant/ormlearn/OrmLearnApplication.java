package com.cognizant.ormlearn;

import com.cognizant.ormlearn.model.Country;
import com.cognizant.ormlearn.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.Page;

@SpringBootApplication
public class OrmLearnApplication implements CommandLineRunner {

    @Autowired
    private CountryService countryService;

    public static void main(String[] args) {
        SpringApplication.run(OrmLearnApplication.class, args);
    }

    @Override
    public void run(String... args) {

        System.out.println("===== ALL COUNTRIES =====");
        countryService.getAllCountries()
                .forEach(System.out::println);

        System.out.println("\n===== FIND COUNTRY =====");
        System.out.println(
                countryService.findCountryByCode("IN")
        );

        System.out.println("\n===== ADD COUNTRY =====");

        countryService.addCountry(
                new Country("FR", "France")
        );

        countryService.getAllCountries()
                .forEach(System.out::println);



        System.out.println("\n===== FIND BY NAME =====");

        countryService.findCountryByName("India")
                .forEach(System.out::println);


        System.out.println("\n===== FIND COUNTRY CONTAINING =====");

        countryService.findCountryContaining("Ind")
                .forEach(System.out::println);



        System.out.println("\n===== @QUERY TEST =====");

        countryService.getCountryByName("India")
                .forEach(System.out::println);



        System.out.println("\n===== PAGINATION =====");

        Page<Country> page = countryService.getCountryPage(0, 3);

        page.getContent().forEach(System.out::println);

        System.out.println("Current Page : " + page.getNumber());
        System.out.println("Total Pages  : " + page.getTotalPages());
        System.out.println("Total Records: " + page.getTotalElements());

        System.out.println("\n===== SORT ASCENDING =====");

        countryService.getCountriesSortedAscending()
                .forEach(System.out::println);

        System.out.println("\n===== SORT DESCENDING =====");

        countryService.getCountriesSortedDescending()
                .forEach(System.out::println);

    }
}