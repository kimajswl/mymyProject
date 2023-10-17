package com.example.loginservice.service;

import com.example.loginservice.entity.Customer;
import com.example.loginservice.form.CustomerForm;
import com.example.loginservice.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class CustomerService {

    private final CustomerRepository customerRepository;
    private final PasswordEncoder passwordEncoder;

    @Transactional
    public void createUser(CustomerForm customerForm){
        Customer customer = Customer.builder()
                .customerEmail(customerForm.getCustomerEmail())
                .customerPassword(passwordEncoder.encode(customerForm.getCustomerPassword())) // 비밀번호 암호화 적용
                .build();

        customerRepository.save(customer);
    }

}
