package com.skillbox.blog.dto;

import lombok.Data;

@Data
public class CaptchaDto {
    private String secret;
    private String image;
}
