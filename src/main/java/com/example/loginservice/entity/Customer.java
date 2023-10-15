package com.example.loginservice.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity @Getter @Builder
@NoArgsConstructor
@AllArgsConstructor
public class Customer {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long customerId;

    @Column(nullable = false)
    private String customerEmail;

    @Column(nullable = false)
    private String customerPassword;

}
