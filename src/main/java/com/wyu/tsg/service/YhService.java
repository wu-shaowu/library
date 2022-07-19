package com.wyu.tsg.service;


import com.wyu.tsg.entity.Book;
import com.wyu.tsg.entity.Yh;
import com.wyu.tsg.repository.BookRepository;
import com.wyu.tsg.repository.YhRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.List;

@Service
public class YhService {
    @Autowired
    YhRepository yhRepository;

    @Autowired
    BookRepository bookRepository;
    public void test(){
        Yh yh = new Yh();
        yh.setUsername("李四");
        yh.setPassword("123");
        yh.setSjh(123456);
        yhRepository.save(yh);

         yh = new Yh();
        yh.setUsername("张三");
        yh.setPassword("123");
        yh.setSjh(123456);
        yhRepository.save(yh);

        Book book = new Book();
        book.setSh("A123");
        book.setSl(15);
        book.setSm("西游记");
        bookRepository.save(book);

        book = new Book();
        book.setSh("B123");
        book.setSl(10);
        book.setSm("三国演义");
        bookRepository.save(book);
    }
}
