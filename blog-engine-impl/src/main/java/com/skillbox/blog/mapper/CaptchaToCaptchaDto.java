package com.skillbox.blog.mapper;

import com.skillbox.blog.dto.CaptchaDto;
import com.skillbox.blog.entity.CaptchaCode;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CaptchaToCaptchaDto {

    @Mapping(source = "code", target = "secret")
    @Mapping(source = "secretCode", target = "image")
    CaptchaDto map (CaptchaCode captchaCode);
}
