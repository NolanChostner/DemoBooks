package com.nolanchostner.demoBooks;


import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookRegistration {

	@Autowired
	Bookrepository bookRepository;

	// post using /bookAdd url
	@PostMapping("/books")
	public Book add(@Valid @RequestBody Book book) {
		return bookRepository.save(book);
	}

	// Put / Update Book
	@PutMapping("/books/{id}")
	public Book updateBook(@PathVariable(value = "id") Integer id, @Valid @RequestBody Book bookdetails) {
		Book Book = bookRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Book", "id", id));

		Book.setName(bookdetails.getName());
		Book.setAuthor(bookdetails.getAuthor());

		Book updatedBook = bookRepository.save(Book);
		return updatedBook;

	}

	@DeleteMapping(path = "books/{id}")
	public ResponseEntity<?> deleteBook(@PathVariable(value = "id") Integer id) {
			Book book = bookRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Book", "id", id));
			bookRepository.delete(book);
				return ResponseEntity.ok().build();

	}

	// Get / display all records using /books url
	@GetMapping("/books")
	public List<Book> getAllBooks() {
		return bookRepository.findAll();

	}
}
