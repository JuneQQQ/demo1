package com.example.demo.service;

import com.example.demo.dao.entity.Demo;

import java.util.List;

public interface DemoService {
    List<Demo> getDemo();

    Integer count();

    void add(Demo demo);

    void updateById(Demo demo);

    void deleteById(Long id);
}
