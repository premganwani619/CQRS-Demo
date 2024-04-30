package com.BookstoreApplication.BookstoreApplication.command;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class BookCommand {
    private String title;
    private String author;
}
