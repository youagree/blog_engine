package com.skillbox.blog.dto;

import lombok.Data;

@Data
public class ErrorsDto {
    private String email;
    private String name;
    private String password;
    private String captcha;
}
