package com.cs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by chenjing on 2016/12/10.
 */
@Controller
public class LoginController {
    @RequestMapping("toLogin")
    public String toLogin(){
        return "login";
    }
}
