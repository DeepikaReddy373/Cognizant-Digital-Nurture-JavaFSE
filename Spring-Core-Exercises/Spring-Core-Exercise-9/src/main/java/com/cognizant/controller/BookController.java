package com.cognizant.librarymanagement.controller;

import com.cognizant.librarymanagement.entity.Book;
import com.cognizant.librarymanagement.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookRepository repository;

    @PostMapping
    public Book addBook(@RequestBody Book book) {
        return repository.save(book);
    }

    @GetMapping
    public Iterable<Book> getBooks() {
        return repository.findAll();
    }
}