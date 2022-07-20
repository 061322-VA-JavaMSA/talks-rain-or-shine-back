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
	private BlogService bs;
	
    @Override
    public void run(ApplicationArguments args) throws Exception {
    	User a = new User();
    	a.setFirstName("first");
    	a.setLastName("test");
    	a.setEmail("firsttest@email.com");
    	a.setUsername("ft");
    	a.setPassword("pass");
    	ts.addUser(a);
    	
    	User t1 = ts.getByUsername("ft");    	
    	System.out.println("Test user 1: " + t1);
    	
    	List<User> users = ts.getUsers();
    	System.out.println(users);
    	
    	Blog b = new Blog();
    	b.setBody("Hello World! First Blog Test!");
    	b.setUserId(1);
    	bs.addBlog(b);
    	
    	Blog b1 = bs.getBlogById(1);  	
    	System.out.println("Test blog 1: " + b1);
    	
    	List<Blog> blogs = bs.getBlogs();
    	System.out.println(blogs);
    	
    }
}
