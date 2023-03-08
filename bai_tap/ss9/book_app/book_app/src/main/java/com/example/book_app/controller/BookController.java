package com.example.book_app.controller;

import com.example.book_app.model.Book;
import com.example.book_app.model.PayBook;
import com.example.book_app.service.IBookService;
import com.example.book_app.service.IPayBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class BookController {
    @Autowired
    private IBookService bookService;
    @Autowired
    private IPayBookService payBookService;


    @GetMapping("/book")
    public String showList(@RequestParam(required = false, defaultValue = "") String nameSearch,
                           @PageableDefault(size = 2, page = 0) Pageable pageable, Model model
    ) {
        Page<Book> bookPage = bookService.findAll(nameSearch, pageable);
        model.addAttribute("pageBook", bookPage);
        return "list";
    }
    @GetMapping("/book/create")
    public String showFormCreate(Model model){
        model.addAttribute("book", new Book());
        return "create";
    }
    @PostMapping("save")
    public String save(@ModelAttribute Book book, RedirectAttributes attributes){
        bookService.save(book);
        attributes.addFlashAttribute("message","thêm mới oke");
        return "redirect:/book";
    }
    @GetMapping("book/borrow")
    public String borrow(@RequestParam int id, RedirectAttributes redirectAttributes) {
        Book book = bookService.findById(id);
        if (book.getQuantity()<=0){
            throw  new NullPointerException("Số lượng sách đã hết");
        }
        int code = (int) (Math.random() * 100000);
        PayBook payBook = new PayBook(code,book);
        payBookService.save(payBook);
        book.setQuantity(book.getQuantity() - 1);
        bookService.save(book);
        redirectAttributes.addFlashAttribute("mess","Success borrow");
        return "redirect:/book";
    }
    @PostMapping ("/book/pay")
    public String pay(@RequestParam int code ,RedirectAttributes redirectAttributes){
        PayBook payBook =payBookService.findByCode(code);
        Book book =  payBook.getBook();
        book.setQuantity(book.getQuantity()+1);
        bookService.save(book);
        payBookService.delete(payBook);
        redirectAttributes.addFlashAttribute("mess","Success PayBook");
        return "redirect:/book";
    }

    @PostMapping
    @ExceptionHandler(Exception.class)
    public String handlerExceptionCommon(){
        return "error";
    }
}