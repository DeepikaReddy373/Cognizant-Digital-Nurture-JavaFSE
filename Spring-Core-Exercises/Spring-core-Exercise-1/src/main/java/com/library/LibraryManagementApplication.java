package com.library;

import com.library.repository.BookRepository;
import com.library.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LibraryManagementApplication {

    public static void main(String[] args) {

        // Load Spring XML Configuration
        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        // Get BookRepository Bean
        BookRepository repository =
                context.getBean("bookRepository", BookRepository.class);

        // Get BookService Bean
        BookService service =
                context.getBean("bookService", BookService.class);

        // Call Methods
        repository.displayBook();
        service.issueBook();
    }
}