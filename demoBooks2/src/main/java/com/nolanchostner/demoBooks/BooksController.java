/*package com.nolanchostner.demoBooks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;
import com.nolanchostner.demoBooks.Book;
import com.nolanchostner.demoBooks.BookRegistration;
@RestController
public class BooksController {
    @GetMapping("/books")
    public List<Book> getAllBook() {
        return BookRegistration.getInstance().getBookRecords();
    }
    @PostMapping("/books")
    public void createBook(Book book) {
        BookRegistration.getInstance().add(book);
    }
    
    @PutMapping("/books")
    public void changeBook(Book book) {
        BookRegistration.getInstance().updateBook(book);
    }
    
    @DeleteMapping("/books")
    public void removeBook (int id) {
        BookRegistration.getInstance().deleteBook(id);
    }
//Web Service is a software system designed to allow machine to machine interaction
//over a network in a specific format such as HTTP, SOAP, or other standard formats    
//
//RESTful Services are are an architectural style for creating web services based on
//HTTP protocol, but is not dependent on any protocol. It is lightweight, scalable, and
//maintainable     
    
}*/