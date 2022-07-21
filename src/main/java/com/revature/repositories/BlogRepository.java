package com.revature.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.models.Blog;

@Repository
public interface BlogRepository extends JpaRepository<Blog, Integer> {
	List<Blog> findBlogsByUserId(int userId);
}