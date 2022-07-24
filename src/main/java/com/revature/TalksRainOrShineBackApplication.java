package com.revature;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import com.revature.models.Blog;
import com.revature.models.User;
import com.revature.services.BlogService;
import com.revature.services.UserService;

@SpringBootApplication
public class TalksRainOrShineBackApplication {

	public static void main(String[] args) {
		SpringApplication.run(TalksRainOrShineBackApplication.class, args);
	}

}

@Component
class AppStartupRunner implements ApplicationRunner {

	@Autowired
	private UserService ts;
	@Autowired
	private BlogService bs;
	
    @Override
    public void run(ApplicationArguments args) throws Exception {
    	
    	List<Blog> blogs = bs.findBlogsByUserId(1);
    	System.out.println(blogs);
    	
    }
}
