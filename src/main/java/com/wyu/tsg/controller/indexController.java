package com.wyu.tsg.controller;

import com.wyu.tsg.repository.YhRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller

public class indexController {

    @RequestMapping("/index")
    public String index(){
        return "index";
    }



}
