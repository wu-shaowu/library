package com.wyu.tsg.controller;

import com.wyu.tsg.entity.Book;
import com.wyu.tsg.entity.Jy;
import com.wyu.tsg.entity.Yh;
import com.wyu.tsg.repository.BookRepository;
import com.wyu.tsg.repository.JyRepository;
import com.wyu.tsg.repository.YhRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.util.List;

@Controller
@RequestMapping("/glsy")
@SessionAttributes("gljyid")
public class glsyController {
    @Autowired
    BookRepository bookRepository;
    @Autowired
    YhRepository yhRepository;
    @Autowired
    JyRepository jyRepository;

    @RequestMapping(method = RequestMethod.GET)
    public String glsy(Book book) {
        return "glsy";
    }

    @RequestMapping(value = "/chaxunjieyue", method = RequestMethod.GET)
    public String chaxunjieyue(@ModelAttribute("chaxunjieyue") Yh sjh, Model model) {
        return "glchaxunjieyue";
    }
    @RequestMapping(value = "/chaxunjieyue", method = RequestMethod.POST)
    public String chaxuejieyue2(@ModelAttribute("chaxunjieyue") Yh sjh, Model model) {
        Yh yh = yhRepository.findBySjh(sjh.getSjh());
        model.addAttribute("gljyid", yh.getId());
        return "redirect:/glsy/gljy";
    }
    @RequestMapping(value = "/gljy")
    public String chaxuejieyueshow(@ModelAttribute("gljyid") int gljy, Model model) {
        Yh sjh = yhRepository.findById(gljy).orElseThrow(null);
        List<Jy> allgljy = jyRepository.findBySjhOrderByKstimeDesc(sjh);
        model.addAttribute("allgljy", allgljy);
        return "glxsjy";
    }
    @RequestMapping(value = "/gljhuanshu/{yhjyid}")
    public String glhuanshu(@ModelAttribute("yhjyid") int yhjyid, Model model) {
        Jy jy1 = jyRepository.findById(yhjyid);
        jyRepository.delete(jy1);
        return "redirect:/glsy/gljy";
    }

    @RequestMapping(value = "/gljiashu", method = RequestMethod.GET)
    public String gljiashu(@ModelAttribute("gljiashu") Book book, Model model) {

        return "gljiashu";
    }
    @RequestMapping(value = "/gljiashu", method = RequestMethod.POST)
    public String gljiashu2(@ModelAttribute("gljiashu") Book book, Model model) {
        bookRepository.save(book);
        model.addAttribute("gljiashujg", book.getSh() + "已经录入");
        return "gljiashu";
    }

    @RequestMapping(value = "/glshanren", method = RequestMethod.GET)
    public String glshanren(@ModelAttribute("glshanren") Yh yh, Model model) {

        return "glshanren";
    }
    @RequestMapping(value = "/glshanren", method = RequestMethod.POST)
    public String glshanren2(@ModelAttribute("glshanren") Yh yh, Model model) {
        Yh yh1 = yhRepository.findBySjh(yh.getSjh());

        yhRepository.delete(yh1);
        model.addAttribute("glshanrenjg", yh.getSjh() + "已经删除");

        return "glshanren";
    }


}