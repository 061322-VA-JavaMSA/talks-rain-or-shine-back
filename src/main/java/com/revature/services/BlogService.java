package com.revature.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.revature.exceptions.BlogNotFoundException;
import com.revature.models.Blog;
import com.revature.repositories.BlogRepository;

@Service
public class BlogService {

	private BlogRepository br;


	public BlogService(BlogRepository br) {
		super();
		this.br = br;
	}

	public List<Blog> getBlogs(){
		return br.findAll();
	}

	public Blog getBlogById(int id) throws BlogNotFoundException {
		Blog blog = br.findById(id).orElseThrow(() -> new BlogNotFoundException());
		return blog;
	}

	public Blog addBlog(Blog blog) {
		return br.save(blog);
	}

	public void deleteBlog(int id) throws BlogNotFoundException {
		Blog blog = br.findById(id).orElseThrow(() -> new BlogNotFoundException());
		br.delete(blog);
	}

	public List<Blog> findBlogsByUserId(int userId){
		List<Blog> blogs = br.findBlogsByUserId(userId);
		return blogs;

	}

  public Blog updateBlog(Blog blog) throws BlogNotFoundException {
    return br.save(blog);
  }

}
