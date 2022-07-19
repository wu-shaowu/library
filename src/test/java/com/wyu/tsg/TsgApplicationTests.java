package com.wyu.tsg;

import com.wyu.tsg.entity.Yh;
import com.wyu.tsg.repository.YhRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TsgApplicationTests {
    @Autowired
    YhRepository yhRepository;
    @Test
    void contextLoads() {
        Yh yh = yhRepository.findById(9).get();
      yhRepository.delete(yh);


    }

}
