package com.cognizant.exercise2loadsimpledateformat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.text.SimpleDateFormat;
import java.util.Date;

@SpringBootApplication
public class Exercise2LoadSimpleDateFormatApplication {

    public static void main(String[] args) throws Exception {

        SpringApplication.run(Exercise2LoadSimpleDateFormatApplication.class, args);

        displayDate();
    }

    public static void displayDate() throws Exception {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("date-format.xml");

        SimpleDateFormat format =
                context.getBean("dateFormat", SimpleDateFormat.class);

        Date date = format.parse("31/12/2018");

        System.out.println(date);

        ((ClassPathXmlApplicationContext) context).close();
    }
}