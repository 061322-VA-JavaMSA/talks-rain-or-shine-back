package com.revature.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.revature.exceptions.BlogNotFoundException;
import com.revature.models.Blog;
import com.revature.services.BlogService;

@RestController
@CrossOrigin(origins = {"http://localhost:4200", "http://pomtreesbucket.s3-website-us-east-1.amazonaws.com"})
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

  @PutMapping("/blogs")
  public Blog updateBlog(@RequestBody Blog blog) throws BlogNotFoundException {
    return bs.updateBlog(blog);
  }


}
