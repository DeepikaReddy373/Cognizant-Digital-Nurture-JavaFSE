package com.cognizant.librarymanagement.service;

import com.cognizant.librarymanagement.repository.BookRepository;

public class BookService {

    private BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void issueBook() {
        System.out.println("Book Service is Working");
        bookRepository.display();
        System.out.println("Book Issued Successfully");
    }
}