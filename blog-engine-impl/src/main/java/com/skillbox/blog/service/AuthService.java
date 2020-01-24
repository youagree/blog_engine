package com.skillbox.blog.service;

import com.skillbox.blog.dto.CaptchaDto;
import com.skillbox.blog.dto.ResponseDto;
import com.skillbox.blog.dto.UserDto;
import com.skillbox.blog.entity.CaptchaCode;
import com.skillbox.blog.entity.User;
import com.skillbox.blog.mapper.CaptchaToCaptchaDto;
import com.skillbox.blog.mapper.UserDtoToUser;
import com.skillbox.blog.repository.CaptchaRepository;
import com.skillbox.blog.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.patchca.color.SingleColorFactory;
import org.patchca.filter.predefined.CurvesRippleFilterFactory;
import org.patchca.service.ConfigurableCaptchaService;
import org.patchca.utils.encoder.EncoderHelper;
import org.springframework.stereotype.Service;

import java.awt.*;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Base64;

@Service
@AllArgsConstructor
public class AuthService {

    private UserRepository userRepository;
    private CaptchaRepository captchaRepository;
    private CaptchaToCaptchaDto captchaToCaptchaDto;
    private UserDtoToUser userDtoToUser;

    public ResponseDto registerNewUser(UserDto user) {


        userRepository.save(userDtoToUser.map(user));

        return new ResponseDto();
    }

    public CaptchaDto genAndSaveCaptcha() throws IOException {
        ConfigurableCaptchaService cs = new ConfigurableCaptchaService();
        cs.setColorFactory(new SingleColorFactory(new Color(25, 60, 170)));
        cs.setFilterFactory(new CurvesRippleFilterFactory(cs.getColorFactory()));

        CaptchaCode captchaCode;
        try (ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream()) {
            String decodeCode = EncoderHelper.getChallangeAndWriteImage(cs, "png", byteArrayOutputStream);
            String encodeCode = Base64.getEncoder().encodeToString(byteArrayOutputStream.toByteArray());
            captchaCode = new CaptchaCode()
                    .setCode(decodeCode)
                    .setSecretCode(encodeCode)
                    .setTime(LocalDateTime.now());
        }
        captchaRepository.save(captchaCode);
        return captchaToCaptchaDto.map(captchaCode);
    }
//
//    public ResponseEntity<User> createNewUser(){
//
//    }
}
