package com.example.validate.service;

import com.example.validate.model.User;
import com.example.validate.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements IUserService {
    @Autowired
    private IUserRepository userRepository;
    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public boolean save(User user) {
      if (userRepository.findById(user.getId()).isPresent()){
          return false;
      }try {
          userRepository.save(user);
        }catch (DataIntegrityViolationException e){
          return false;
        }
        return false;
    }
}
