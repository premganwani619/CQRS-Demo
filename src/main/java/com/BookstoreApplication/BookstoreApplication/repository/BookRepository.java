package com.BookstoreApplication.BookstoreApplication.repository;

import com.BookstoreApplication.BookstoreApplication.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
