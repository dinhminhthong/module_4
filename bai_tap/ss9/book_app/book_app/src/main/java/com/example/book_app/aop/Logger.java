package com.example.book_app.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Logger {
    int count = 0;
    int count1 = 0;

    @Pointcut("execution(* com.example.book_app.controller.BookController.showList(..))")
    public void getShowList() {
    }

    @After(value = "getShowList()")
    public void printChange() {
        count1++;
        System.out.println("Số lần ghé thăm thư viện sách: " + count1);
    }

    @Pointcut("execution(* com.example.book_app.controller.BookController.borrow(..))")
    public void getBorrow() {
    }

    @After(value = "getBorrow()")
    public void printChangeBorrow() {
        count++;
        System.out.println("Số lần thư viện sách bị thay đổi: " + count);
    }

    @Pointcut("execution(* com.example.book_app.controller.BookController.pay(..))")
    public void getPay() {
    }
    @After(value = "getPay()")
    public void printChangPay(){
        count++;
        System.out.println("Số lần thư viện sách bị thay đổi: " + count);
    }
}
