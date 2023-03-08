package com.example.book_app.service.impl;

import com.example.book_app.model.PayBook;
import com.example.book_app.repository.IPayBookRepository;
import com.example.book_app.service.IPayBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PayBookService implements IPayBookService {
    @Autowired
    private IPayBookRepository payBookRepository;

    @Override
    public void save(PayBook payBook) {
        payBookRepository.save(payBook);
    }

    @Override
    public void delete(PayBook payBook) {
            payBookRepository.delete(payBook);
    }

    @Override
    public PayBook findByCode(int code) {
        return payBookRepository.findByCode(code);
    }
}
