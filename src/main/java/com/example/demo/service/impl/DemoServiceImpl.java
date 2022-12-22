package com.example.demo.service.impl;

import com.example.demo.dao.entity.Demo;
import com.example.demo.dao.mapper.DemoMapper;
import com.example.demo.service.DemoService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DemoServiceImpl implements DemoService {

    @Resource
    private DemoMapper demoMapper;

    @Override
    public List<Demo> getDemo() {
        return demoMapper.getDemoList();
    }

    public Integer count(){
        return demoMapper.count();
    }

    @Override
    public void add(Demo demo) {
        demoMapper.add(demo);
    }

    @Override
    public void updateById(Demo demo) {
        demoMapper.updateById(demo);
    }

    @Override
    public void deleteById(Long id) {
        demoMapper.deleteById(id);
    }
}
