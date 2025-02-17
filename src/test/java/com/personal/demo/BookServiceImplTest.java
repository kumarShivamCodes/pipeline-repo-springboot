package com.personal.demo;


import com.personal.demo.model.Book;
import com.personal.demo.service.BookService;
import com.personal.demo.service.BookServiceImpl;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

class BookServiceImplTest {

    private BookService bookService = new BookServiceImpl();

    @Test
    void shouldReturnAllBooks() {
        List<Book> books = bookService.getAllBooks();
        assertEquals(2, books.size());
        assertEquals("1984", books.get(1).getTitle());
    }
}
