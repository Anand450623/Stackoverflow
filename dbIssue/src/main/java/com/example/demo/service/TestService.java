package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Test;

public interface TestService 
{
	public void insert(List<Test> testList);
	public void deleteByName(String name);
}
