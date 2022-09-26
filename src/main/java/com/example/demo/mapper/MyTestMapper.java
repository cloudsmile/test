package com.example.demo.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface MyTestMapper {
    @Select("select count(*) from d5000.test")
    Integer getCount2();

    Integer getCount();

    Integer getFeederCount();
}
