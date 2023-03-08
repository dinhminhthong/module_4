package com.example.book_app.service;

import com.example.book_app.model.Book;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IBookService {
    Page<Book> findAll(String name, Pageable pageable);
    Book findById(int id);
    void save (Book book);
}
