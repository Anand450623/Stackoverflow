package com.example.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.example.demo.service.Test;

@Service
public class TestImpl implements Test
{

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public Long getCount() 
    {        
        return (Long) jdbcTemplate.queryForList("select count(*) from {h-schema}test").get(0).values().toArray()[0];
    }

}