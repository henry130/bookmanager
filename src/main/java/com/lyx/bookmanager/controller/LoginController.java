package com.lyx.bookmanager.controller;

import com.lyx.bookmanager.mapper.ReaderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
public class LoginController {

    @Autowired
    private ReaderMapper readerMapper;

    @RequestMapping({"/", "/index"})
    public String login(HttpSession session) {
        return "index";
    }

    @RequestMapping({"/toLoginPage"})
    public String toLoginPage() {
        return "login";
    }


}
