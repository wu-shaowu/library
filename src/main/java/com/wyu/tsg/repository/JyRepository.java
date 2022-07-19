package com.wyu.tsg.repository;


import com.wyu.tsg.entity.Jy;
import com.wyu.tsg.entity.Yh;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface JyRepository extends CrudRepository<Jy,Integer> {
       Jy findByShAndSjh(String sh, Yh sjh);
       List<Jy> findBySjhOrderByKstimeDesc(Yh sjh);
       Jy findById(int id);


}