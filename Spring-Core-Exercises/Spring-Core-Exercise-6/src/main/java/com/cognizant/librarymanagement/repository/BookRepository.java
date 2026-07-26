package com.cognizant.librarymanagement.repository;

import org.springframework.stereotype.Repository;

@Repository
public class BookRepository {

    public void display() {
        System.out.println("Book Repository is Working");
    }
}