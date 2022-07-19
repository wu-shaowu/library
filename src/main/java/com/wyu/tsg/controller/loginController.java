package com.wyu.tsg.controller;

import com.wyu.tsg.entity.Yh;
import com.wyu.tsg.repository.YhRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@RequestMapping("/user")
@SessionAttributes("alluser")

public class loginController {

    @Autowired
    YhRepository yhRepository;
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(@ModelAttribute("yh") Yh yh) {
        return "login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String loginPost(@ModelAttribute("yh") Yh yh, Model model) {
        Yh author = yhRepository.findFirstBySjhAndPassword(yh.getSjh(),yh.getPassword());
        System.out.println(author);
        if(author == null){
            model.addAttribute("errorMsg","错误");
            return "login";
        }
        if (author.getBz()==null){
            model.addAttribute("alluser",author.getId());
            return "redirect:/sy";

        }else {
            model.addAttribute("alluser",author.getId());
            return "redirect:/glsy";
        }
    }

    @RequestMapping(value = "/zhuce", method = RequestMethod.GET)
    public String zhuce(@ModelAttribute("yhzhuce") Yh yhzhuce) {
        return "zhuce";
    }
    @RequestMapping(value = "/zhuce", method = RequestMethod.POST)
    public String zhucePost(@ModelAttribute("yhzhuce") Yh yhzhuce, Model model) {
            yhRepository.save(yhzhuce);
            if (yhzhuce ==null){
                model.addAttribute("errorM","错误");
            }
            return "redirect:/index";
    }
}
