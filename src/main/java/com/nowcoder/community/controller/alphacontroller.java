package com.nowcoder.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/alpha")
public class alphacontroller {

    @RequestMapping("/hello")
    @ResponseBody
    public String sayhi(){
        return "Hi Spring. ";
    }
}
