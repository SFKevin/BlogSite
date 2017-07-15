package com.skf.test;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.skf.domain.Author;
import com.skf.domain.Blog;
import com.skf.domain.BlogVO;
import com.skf.service.AuthorService;
import com.skf.service.BlogService;

public class Test {
	SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

	@org.junit.Test
	public void CURDTest() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		AuthorService authorService = (AuthorService) ctx
				.getBean("authorServiceImpl");
		Author author = new Author();
		// authorService.deleteById("1e495a88-5f93-453a-bdc1-a1917a4a13dd");
		// System.out.println(author.getAuthorEmail());
		author.setAuthorId(UUID.randomUUID().toString());
		author.setAuthorEmail("kfsun@seu.edu.cn");
		author.setAuthorNickname("飞");
		author.setAuthorPassword("123456");
		author.setAuthorPicture("picture");
		author.setAuthorQq("123456789");
		author.setAuthorRegisterTime(date.format(new Date()));
		author.setAuthorSaying("#########");
		authorService.insert(author);
	}

	@org.junit.Test
	public void BlogTest() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		BlogService blogService = (BlogService) ctx.getBean("blogServiceImpl");
		List<Blog> blogs = blogService.getLatestBlog();
		List<Blog> blogs2 = blogService.getBlogsByAlias("java");
		Blog blog = new Blog();
		BlogVO blogVO = new BlogVO();
		blog.setAuthorId("67c0b733-ffa0-4ca6-935a-1b98e95af6b9");
		blog.setBlogTitle("Java");
		// blogService.insert(blog);
		// blogVO =
		// blogService.getBlogVO("e9b4a2cf-2920-4c0b-a217-0a0911bbebae");
	}
}
