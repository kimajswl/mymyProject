package com.example.loginservice.controller;

import com.example.loginservice.form.CustomerForm;
import com.example.loginservice.service.CustomerService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CustomerController {

    private final CustomerService customerService;

    @PostMapping("/signup")
    public void customerSignup(@Valid CustomerForm customerForm){

        customerService.createUser(customerForm);
    }
}
