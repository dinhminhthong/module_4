package com.example.book_app.service;

import com.example.book_app.model.PayBook;

public interface IPayBookService {
    void save(PayBook payBook);
    void  delete (PayBook payBook);
    PayBook findByCode(int code);
}
