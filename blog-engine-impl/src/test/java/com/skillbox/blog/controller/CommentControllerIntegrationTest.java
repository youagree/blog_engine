package com.skillbox.blog.controller;

import com.skillbox.blog.utils.IntegrationTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.web.client.TestRestTemplate;

@IntegrationTest
public class CommentControllerIntegrationTest {

  @Autowired
  TestRestTemplate testRestTemplate;
}
