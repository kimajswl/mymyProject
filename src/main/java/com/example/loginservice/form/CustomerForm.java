package com.example.loginservice.form;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import jakarta.validation.constraints.Email;

@Data
@Getter @Setter
public class CustomerForm {

    @Email
    @NotBlank
    private String customerEmail;

    @NotBlank
    private String customerPassword;
}
