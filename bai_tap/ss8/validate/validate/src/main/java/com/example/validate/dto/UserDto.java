package com.example.validate.dto;


import com.sun.istack.NotNull;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.validation.constraints.*;

public class UserDto implements Validator {
    private int id;
    @NotBlank(message = "bạn phải nhập kí tự")
    @NotEmpty(message = "bạn phải điền vào ô trống")
    @Size (min = 5,max = 10)
    private String firstName;
    @NotBlank(message = "Bạn phải nhập vào kí tự")
    @NotEmpty(message = "Bạn phải điền vào ô trống")
    @Size(min = 5,max = 45)
    private String lastName;
    @NotBlank(message = "Bạn phải nhập vào kí tự")
    @NotEmpty(message = "Bạn phải điền vào ô trống")
    private String phoneNumber;
    @Pattern(regexp = "^[0]\\d{9}$",message = "Bạn phải nhập đúng sđt của VN")
    private String age;
    @Min(value = 18,message = "Số tuổi phải lớn hơn hoặc bằng 18")

    public UserDto() {
    }

    public UserDto(int id, String firstName, String lastName, String phoneNumber, String age) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {

    }
}
