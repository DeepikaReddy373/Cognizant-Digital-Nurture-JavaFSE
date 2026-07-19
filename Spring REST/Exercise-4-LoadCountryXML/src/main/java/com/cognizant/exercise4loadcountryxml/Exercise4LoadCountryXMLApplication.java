package com.cognizant.exercise4loadcountryxml;

import com.cognizant.exercise4loadcountryxml.model.Country;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Exercise4LoadCountryXMLApplication {

    private static final Logger LOGGER =
            LoggerFactory.getLogger(Exercise4LoadCountryXMLApplication.class);

    public static void main(String[] args) {

        LOGGER.info("START");

        SpringApplication.run(Exercise4LoadCountryXMLApplication.class, args);

        displayCountry();

        LOGGER.info("END");
    }

    public static void displayCountry() {

        LOGGER.info("START");

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("country.xml");

        Country country = context.getBean("country", Country.class);

        LOGGER.debug("Country : {}", country);

        context.close();

        LOGGER.info("END");
    }
}