package com.cognizant.librarymanagement.service;

import com.cognizant.librarymanagement.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public void issueBook() {
        System.out.println("Book Service is Working");
        bookRepository.display();
        System.out.println("Book Issued Successfully");
    }
}