package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Test;
import com.example.demo.repository.TestRepository;
import com.example.demo.service.TestService;

@Service
public class TestServiceImpl implements TestService 
{
	@Autowired
	TestRepository testRepository;

	@Override
	public void insert(List<Test> testList) 
	{
		testRepository.deleteAllInBatch();
		testRepository.saveAll(testList);
	}
	
	@Override
	public void deleteByName(String name)
	{
		System.err.println("The number of rows to be deleted = "+testRepository.findByName(name).size());
		try
		{
			testRepository.deleteInBatch(testRepository.findByName(name));
		}
		catch(Exception e)
		{
			System.out.println("Error occured");
		}
	}
	
	
}
