package com.example.book_app.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int quantity;
    @OneToMany(mappedBy = "book")
    Set<PayBook> payBookSet;

    public Book() {
    }

    public Book(int id, String name, int quantity, Set<PayBook> payBookSet) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.payBookSet = payBookSet;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Set<PayBook> getPayBookSet() {
        return payBookSet;
    }

    public void setPayBookSet(Set<PayBook> payBookSet) {
        this.payBookSet = payBookSet;
    }
}
