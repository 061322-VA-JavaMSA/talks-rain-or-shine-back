package com.revature.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.revature.exceptions.BlogNotFoundException;
import com.revature.models.Blog;
import com.revature.services.BlogService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class BlogController {
	
	private BlogService bs;
	
	public BlogController() {
		super();
	}
	
	@Autowired
	public BlogController(BlogService bs) {
		super();
		this.bs = bs;
	}
	
	@GetMapping("/blogs")
	public List<Blog> getBlogs(){
		return (List<Blog>) bs.getBlogs();
	}
	
	@PostMapping("/blogs")
	void addBlog(@RequestBody Blog blog) {
		bs.addBlog(blog);
	}
	
	@DeleteMapping("/blogs/{id}")
	void deleteBlog(@PathVariable("id") int id) throws BlogNotFoundException {
		bs.deleteBlog(id);
	}
	

}
