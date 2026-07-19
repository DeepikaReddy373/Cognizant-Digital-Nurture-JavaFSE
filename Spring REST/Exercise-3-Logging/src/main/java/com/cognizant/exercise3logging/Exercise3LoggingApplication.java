package com.cognizant.exercise3logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.text.SimpleDateFormat;
import java.util.Date;

@SpringBootApplication
public class Exercise3LoggingApplication {

    private static final Logger LOGGER =
            LoggerFactory.getLogger(Exercise3LoggingApplication.class);

    public static void main(String[] args) throws Exception {

        LOGGER.info("START");

        SpringApplication.run(Exercise3LoggingApplication.class, args);

        displayDate();

        LOGGER.info("END");
    }

    public static void displayDate() throws Exception {

        LOGGER.info("START");

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("date-format.xml");

        SimpleDateFormat format =
                context.getBean("dateFormat", SimpleDateFormat.class);

        Date date = format.parse("31/12/2018");

        LOGGER.debug("{}", date);

        context.close();

        LOGGER.info("END");
    }
}