package com.wyu.tsg;

import com.wyu.tsg.service.YhService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TsgApplication implements CommandLineRunner {
    @Autowired
    YhService yhService;

    public static void main(String[] args) {
        SpringApplication.run(TsgApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

    }
}
