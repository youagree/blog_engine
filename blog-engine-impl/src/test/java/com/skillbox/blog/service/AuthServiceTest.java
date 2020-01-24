package com.skillbox.blog.service;

import com.skillbox.blog.resource.AuthController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;


@WebMvcTest(controllers = AuthController.class)
@MockBean(AuthService.class)
public class AuthServiceTest {

    private final String BASE_URL = "/api/auth/register";

    @Autowired
    AuthController authController;

    @Autowired
    MockMvc mockMvc;

    @Test
    public void createUser() throws Exception {
    }
}
