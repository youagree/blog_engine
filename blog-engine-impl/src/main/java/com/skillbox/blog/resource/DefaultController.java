package com.skillbox.blog.resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class DefaultController {

    public String getHomePage(){
        return "index";
    }
}
