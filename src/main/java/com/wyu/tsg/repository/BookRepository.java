package com.wyu.tsg.repository;


import com.wyu.tsg.entity.Book;
import com.wyu.tsg.entity.Yh;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BookRepository extends CrudRepository<Book,String> {
    Book findFirstBySm(String sm);

}
