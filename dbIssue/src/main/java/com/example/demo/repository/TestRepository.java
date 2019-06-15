package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Test;

public interface TestRepository extends JpaRepository<Test, Integer> 
{
	List<Test> findByName(String name);
}
