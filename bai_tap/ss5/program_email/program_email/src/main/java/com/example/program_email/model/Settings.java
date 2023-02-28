package com.example.program_email.model;

public class Settings {
    private  int id;
    private String languages;
    private String pageSize;
    private boolean spamsFillter;
    private String signature;

    public Settings() {
    }

    public Settings(int id, String languages, String pageSize, boolean spamsFillter, String signature) {
        this.id = id;
        this.languages = languages;
        this.pageSize = pageSize;
        this.spamsFillter = spamsFillter;
        this.signature = signature;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLanguages() {
        return languages;
    }

    public void setLanguages(String languages) {
        this.languages = languages;
    }

    public String getPageSize() {
        return pageSize;
    }

    public void setPageSize(String pageSize) {
        this.pageSize = pageSize;
    }

    public boolean getSpamsFillter() {
        return spamsFillter;
    }

    public void setSpamsFillter(boolean spamsFillter) {
        this.spamsFillter = spamsFillter;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }
}
