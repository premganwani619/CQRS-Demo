package com.BookstoreApplication.BookstoreApplication.service;

import com.BookstoreApplication.BookstoreApplication.command.BookCommand;
import com.BookstoreApplication.BookstoreApplication.model.Book;
import com.BookstoreApplication.BookstoreApplication.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

@Service
public class BookService {
    @Autowired
    BookRepository bookRepository;

    public Book getBookById(@PathVariable Long id) {
        return bookRepository.findById(id).get();
    }

    public Book handle(BookCommand command) {
        Book book = new Book();
        book.setTitle(command.getTitle());
        book.setAuthor(command.getAuthor());
        return bookRepository.save(book);
    }
}
