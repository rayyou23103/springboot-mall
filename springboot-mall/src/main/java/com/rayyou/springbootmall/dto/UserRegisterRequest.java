package com.rayyou.springbootmall.dto;

import jakarta.validation.constraints.NotBlank;

public class UserRegisterRequest {
    @NotBlank
    String email;

    @NotBlank
    String password;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
