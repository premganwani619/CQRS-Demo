package com.BookstoreApplication.BookstoreApplication.controller;

import com.BookstoreApplication.BookstoreApplication.command.BookCommand;
import com.BookstoreApplication.BookstoreApplication.command.BookCommandHandler;
import com.BookstoreApplication.BookstoreApplication.model.Book;
import com.BookstoreApplication.BookstoreApplication.service.BookService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/books")
public class BookController {
    private final BookCommandHandler bookCommandHandler;
    private final BookService bookService;

    public BookController(BookCommandHandler bookCommandHandler,BookService bookService) {
        this.bookCommandHandler = bookCommandHandler;
        this.bookService = bookService;
    }

    @PostMapping
    public Book addBook(@RequestBody BookCommand command) {
        return bookCommandHandler.handle(command);
    }

    @GetMapping("/{id}")
    public Book getBookById(@PathVariable Long id) {
        return bookService.getBookById(id);
    }
}
