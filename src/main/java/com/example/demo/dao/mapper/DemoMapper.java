package com.example.demo.dao.mapper;

import com.example.demo.dao.entity.Demo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DemoMapper {

    void updateById(Demo demo);

    List<Demo> getDemoList();


    Integer count();

    void add(Demo demo);

    void deleteById(Long id);
}
