package com.example.validate.service;

import com.example.validate.model.User;

import java.util.List;

public interface IUserService {
    List<User> findAll();
    boolean save (User user);
}
