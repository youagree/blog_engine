package com.skillbox.blog.dto;

import lombok.Data;

import java.util.List;

@Data
public class ResponseDto {
    private Boolean result;
    private List<ErrorsDto> errors;
}
