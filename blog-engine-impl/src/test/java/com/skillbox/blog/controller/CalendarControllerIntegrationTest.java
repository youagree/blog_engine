package com.skillbox.blog.controller;

import com.skillbox.blog.repository.PostRepository;
import com.skillbox.blog.repository.UserRepository;
import com.skillbox.blog.utils.IntegrationTest;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.web.client.TestRestTemplate;

@IntegrationTest
public class CalendarControllerIntegrationTest {

  @Autowired
  TestRestTemplate testRestTemplate;

  @Autowired
  UserRepository userRepository;

  @Autowired
  PostRepository postRepository;

  @BeforeEach
  public void init() {

  }
}
