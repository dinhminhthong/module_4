package com.example.program_email.repository;

import com.example.program_email.model.Settings;

import java.util.List;

public interface ISettingsRepository {
   List<Settings> finAll();
   void  update(Settings settings);
   Settings findById(int id);
}
