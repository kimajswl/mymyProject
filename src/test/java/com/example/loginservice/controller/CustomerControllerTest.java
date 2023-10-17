package com.example.loginservice.controller;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.transaction.annotation.Transactional;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.security.test.web.servlet.request.SecurityMockMvcRequestPostProcessors.csrf;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ActiveProfiles("test")
@Transactional
@SpringBootTest
@AutoConfigureMockMvc
class CustomerControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Test
    @DisplayName("회원가입 성공")
    void signup_success() throws Exception {
        mockMvc.perform(post("/signup")
                .param("customerEmail", "1234@email.com")
                .param("customerPassword", "1234")
                .with(csrf()))
                .andExpect(status().is2xxSuccessful());
    }

    @Test
    @DisplayName("회원가입 실패")
    void signup_fail() throws Exception {
        mockMvc.perform(post("/signup")
                        .param("customerEmail", "1234")
                        .param("customerPassword", "1234")
                        .with(csrf()))
                .andExpect(status().is4xxClientError());
    }
}