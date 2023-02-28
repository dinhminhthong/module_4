package com.example.program_email.service;

import com.example.program_email.model.Settings;

import java.util.List;

public interface ISettingSerivice {
    List<Settings> finAll();
    public void update(Settings settings);
    Settings findById(int id);
}
