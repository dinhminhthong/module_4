package com.example.book_app.service.impl;

import com.example.book_app.model.Book;
import com.example.book_app.repository.IBookRepository;
import com.example.book_app.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class BookService implements IBookService {
    @Autowired
    private IBookRepository bookRepository;

    @Override
    public Page<Book> findAll(String name, Pageable pageable) {
        return bookRepository.findAllBook(name, pageable);
    }

    @Override
    public Book findById(int id) {
        return bookRepository.findById(id).get();
    }

    @Override
    public void save(Book book) {
        bookRepository.save(book);
    }
}
