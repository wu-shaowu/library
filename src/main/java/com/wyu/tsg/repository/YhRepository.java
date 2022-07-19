package com.wyu.tsg.repository;


import com.wyu.tsg.entity.Book;
import com.wyu.tsg.entity.Yh;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;
import java.sql.Timestamp;
import java.util.List;

public interface YhRepository extends CrudRepository<Yh,Integer> {
    Yh findFirstBySjhAndPassword(Integer sjh, String password);
    Yh findBySjh(Integer sjh);


}
