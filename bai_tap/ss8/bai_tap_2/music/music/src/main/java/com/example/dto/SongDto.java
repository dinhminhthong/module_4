package com.example.dto;


import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class SongDto implements Validator {
    private int id;
    private String name;
    @NotEmpty(message = "không được để trống")
    @Size (max = 300,message = "số kí tự không được quá 300")
    @Pattern(regexp = "^([\\p{L}\\s])+$",message = "Không chứa các kí tự đặc biệt như @ ; , . = - + , ….")
    @NotBlank(message = "không được chứa kí tự bằng dấu cách")
    private String singer;
    @Size(max = 100,message = "không được quá 80 kí tự")
    @NotEmpty(message = "không được bỏ trống")
    @Pattern(regexp = "^([\\p{L}\\s])+$",message = "Không chứa các kí tự đặc biệt như @ ; , . = - + , ….")
    @NotBlank(message = "không được chứa kí tự bằng dấu cách")
    private String category;

    public SongDto() {
    }

    public SongDto(int id, String name, String singer, String category) {
        this.id = id;
        this.name = name;
        this.singer = singer;
        this.category = category;
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

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {

    }
}
