package com.example.program_email.service;

import com.example.program_email.model.Settings;
import com.example.program_email.repository.ISettingsRepository;
import com.example.program_email.repository.SettingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SettingService implements ISettingSerivice {
    @Autowired
    private  ISettingsRepository settingsRepository ;

    @Override
    public List<Settings> finAll() {
        return  this.settingsRepository.finAll();
    }

    @Override
    public void update(Settings settings) {
         settingsRepository.update(settings);
    }

    @Override
    public Settings findById(int id) {
        return this.settingsRepository.findById(id);
    }
}
