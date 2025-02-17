package com.personal.demo.service;

import com.personal.demo.model.Book;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Override
    public List<Book> getAllBooks() {
        return List.of(
                new Book(1L, "The Great Gatsby", "F. Scott Fitzgerald"),
                new Book(2L, "1984", "George Orwell")
        );
    }
}