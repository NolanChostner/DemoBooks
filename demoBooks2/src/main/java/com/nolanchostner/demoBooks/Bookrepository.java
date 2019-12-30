package com.nolanchostner.demoBooks;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.nolanchostner.demoBooks.Book;

@Repository
public interface Bookrepository extends JpaRepository<Book, Integer> {

}