package com.skillbox.blog.test_package;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;

@Data
public class TestClass {
    @Value("${spring:application:name}")
    private String applname;
}
