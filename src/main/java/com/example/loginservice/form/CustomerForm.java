package com.example.loginservice.form;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter @Setter
public class CustomerForm {
    private String customerEmail;
    private String customerPassword;
}
