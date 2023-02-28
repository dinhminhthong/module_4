package com.example.program_email.repository;

import com.example.program_email.model.Settings;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class SettingRepository implements ISettingsRepository{
    static List<Settings> list =new ArrayList<>();
    static {
        list.add(new Settings(1,"english","5",true,"e"));
        list.add(new Settings(2,"VietNamese","6",true,"v"));
        list.add(new Settings(1,"janpan","7",false,"j"));
    }

    @Override
    public List<Settings> finAll() {
        return list;
    }

    @Override
    public void update(Settings settings) {
        for (int i=0;i<list.size();i++){
            if (list.get(i).getId()==settings.getId()){
                list.set(i,settings);
            }
        }
    }

    @Override
    public Settings findById(int id) {
        for (int i=0;i<list.size();i++){
            if (list.get(i).getId()==id){
                return list.get(i);
            }
        }
        return null;
    }
}
