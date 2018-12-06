package com.james.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Mapper
//@Component
@Repository
public interface Dao {
//    @Results({@Result(property = "time",  column = "time")})
    @Select("select sysdate time from dual")
     String queryTime();
}
