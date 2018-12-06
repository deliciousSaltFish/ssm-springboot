package com.james.service;

import com.james.dao.Dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MybatisService {
    @Autowired
    Dao dao;
   public String queryTime(){
        return dao.queryTime();
    }
}
