package com.example.dictionary_app.service;

import com.example.dictionary_app.repository.IDictionaryRepository;
import com.example.dictionary_app.service.IDictionaryService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DictionaryService implements IDictionaryService {
    @Autowired
    IDictionaryRepository dictionaryRepository;
    @Override
    public String Search(String english) {
        return dictionaryRepository.Search(english);
    }
}