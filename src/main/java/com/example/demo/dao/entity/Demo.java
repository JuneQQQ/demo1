package com.example.demo.dao.entity;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Demo {
    private Long id;
    private String name;
    private String department;
    private BigDecimal salary;
}
