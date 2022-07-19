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
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/sy")
@SessionAttributes("alluser")
public class syController {

    @Autowired
    BookRepository bookRepository;
    @Autowired
    YhRepository yhRepository;
    @Autowired
    JyRepository jyRepository;
    @RequestMapping(method = RequestMethod.GET)
    public String sy(Book book) {
        return "sy";
    }

    @RequestMapping(value = "/chashu", method = RequestMethod.GET)
    public String chashu(@ModelAttribute("book") Book book, Model model) {
        return "chashu";
    }
    @RequestMapping(value = "/chashu", method = RequestMethod.POST)
    public String chashu2(@ModelAttribute("book") Book book, @ModelAttribute("alluser") int alluser, Model model) {
        System.out.println(book.getSm()+"------------------------");
       Book b = bookRepository.findFirstBySm(book.getSm());
       //model.addAttribute("booksm",book1.getSm());
        System.out.println(b+"------------------------");
       model.addAttribute("booksm",b.getSm());
        model.addAttribute("booksh",b.getSh());
        model.addAttribute("booksl",b.getSl());
        if(b == null){
            model.addAttribute("errorchashu","错误");
        }
        return "chashu";
    }

    @RequestMapping(value = "/jieshu", method = RequestMethod.GET)
    public String jieshu(@ModelAttribute("yhjieshu") Jy jy, @ModelAttribute("alluser") int alluser,Model model) {
        return "jieshu";
    }
    @RequestMapping(value = "/jieshu", method = RequestMethod.POST)
    public String jieshu2(@ModelAttribute("yhjieshu") Jy jy, @ModelAttribute("alluser") int alluser,Model model) {
        jy.setSjh(yhRepository.findById(alluser).orElseThrow(null));
        jyRepository.save(jy);
        model.addAttribute("jieshujg",jy.getSh()+"已借阅成功");
        return "jieshu";
    }

    @RequestMapping(value = "/huanshu", method = RequestMethod.GET)
    public String huanshu(@ModelAttribute("yhhuanshu") Jy jy, @ModelAttribute("alluser") int alluser,Model model) {
        return "huanshu";
    }
    @RequestMapping(value = "/huanshu", method = RequestMethod.POST)
    public String huanshu2(@ModelAttribute("yhhuanshu") Jy jy, @ModelAttribute("alluser") int alluser,Model model) {
        Yh i = yhRepository.findById(alluser).orElseThrow(null);
      //  Jy jy1 = jyRepository.findById(jyRepository.findByShAndSjh(jy.getSh(),i).getId()).get();
        Jy jy1 = jyRepository.findByShAndSjh(jy.getSh(),i);
        jyRepository.delete(jy1);
      model.addAttribute("huanshujg","已归还成功");
        return "huanshu";
    }

    @RequestMapping(value = "/home")
    public String home( @ModelAttribute("alluser")   int  alluser, Model model){
        Yh sjh = yhRepository.findById(alluser).orElseThrow(null);
        Iterable<Jy> alljieyue = jyRepository.findBySjhOrderByKstimeDesc(sjh);
        model.addAttribute("alljieyue",alljieyue);

        return "myhome";
    }
    @RequestMapping(value = "/homehuanshu/{jyid}")
    public String homehuanshu(@ModelAttribute("jyid") int jyid, @ModelAttribute("alluser") int alluser,Model model) {

        //  Jy jy1 = jyRepository.findById(jyRepository.findByShAndSjh(jy.getSh(),i).getId()).get();
        //Jy jy1 = jyRepository.findById(jyid).get();
        Jy jy1 = jyRepository.findById(jyid);
        jyRepository.delete(jy1);

        return "redirect:/sy/home";
    }
}
