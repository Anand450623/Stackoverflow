package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.entity.Test;
import com.example.demo.service.TestService;

@SpringBootApplication
public class DbIssueApplication 
{
	public static void main(String[] args) 
	{
		ApplicationContext context = SpringApplication.run(DbIssueApplication.class, args);
		TestService service = context.getBean(TestService.class);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               		
		long st = System.currentTimeMillis();
		  
		List<Test> testList = new ArrayList<>();		
		for(int i=0;i<5000;i++)
		{
			testList.add(new Test(i,(i%2==0)?"field1":"field2"));
		}
		service.insert(testList);
		
		
		service.deleteByName("field2");
		
		System.err.println("The processing took = "+(System.currentTimeMillis()-st)+" ms");
	}

}
