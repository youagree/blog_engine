package com.skillbox.blog.resource;

import com.skillbox.blog.dto.CaptchaDto;
import com.skillbox.blog.dto.ResponseDto;
import com.skillbox.blog.dto.UserDto;
import com.skillbox.blog.service.AuthService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@AllArgsConstructor
@RequestMapping("api/auth")
public class AuthController {

    private AuthService authService;

    @PostMapping("/register")
    public ResponseEntity<ResponseDto> register(@Validated @RequestBody UserDto user) {
        return new ResponseEntity<>(authService.registerNewUser(user), HttpStatus.OK);
    }

    @GetMapping("/captcha")
    @ResponseStatus(HttpStatus.OK)
    public CaptchaDto genCaptcha() throws IOException {
        return authService.genAndSaveCaptcha();
    }
}
