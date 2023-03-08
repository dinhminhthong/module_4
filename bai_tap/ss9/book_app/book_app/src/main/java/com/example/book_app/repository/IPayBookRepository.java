package com.example.book_app.repository;

import com.example.book_app.model.PayBook;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPayBookRepository extends JpaRepository<PayBook,Integer> {
    PayBook findByCode(int code);
}
