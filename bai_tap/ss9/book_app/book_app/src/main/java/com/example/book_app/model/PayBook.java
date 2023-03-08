package com.example.book_app.model;

import javax.persistence.*;

@Entity
public class PayBook {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int code;
    @ManyToOne
    @JoinColumn(name = "code_book",referencedColumnName = "id")
    private Book book;

    public PayBook() {
    }

    public PayBook(int id, int code, Book book) {
        this.id = id;
        this.code = code;
        this.book = book;
    }

    public PayBook(int code, Book book) {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
}
