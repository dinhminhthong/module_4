package com.example.validate.repository;

import com.example.validate.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IUserRepository extends JpaRepository<User,Integer>{
//    @Query(value = "select email from user",nativeQuery = true)
//    List<String> findByEmail();

}
