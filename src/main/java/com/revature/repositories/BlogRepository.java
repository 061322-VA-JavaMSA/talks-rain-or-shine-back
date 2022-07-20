package com.revature.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.models.Blog;


public interface BlogRepository extends JpaRepository<Blog, Integer> {
	
}