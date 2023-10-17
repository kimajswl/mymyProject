package com.example.loginservice.controller;

import com.example.loginservice.form.CustomerForm;
import com.example.loginservice.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CustomerController {

    private final CustomerService customerService;

    @PostMapping("/signup")
    public void customerSignup(CustomerForm customerForm, Errors errors){
        if(errors.hasErrors()){
            throw new RuntimeException();
        }

        customerService.createUser(customerForm);
    }
}
