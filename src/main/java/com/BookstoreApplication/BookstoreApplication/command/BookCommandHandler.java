package com.BookstoreApplication.BookstoreApplication.command;

import com.BookstoreApplication.BookstoreApplication.model.Book;
import com.BookstoreApplication.BookstoreApplication.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BookCommandHandler {
    private final BookService bookService;
@Autowired
    public BookCommandHandler(BookService bookService) {
        this.bookService = bookService;
    }

    public Book handle(BookCommand command) {
        return bookService.handle(command);
    }
}
