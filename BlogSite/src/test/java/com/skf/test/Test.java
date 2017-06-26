package com.skf.test;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.skf.domain.Author;
import com.skf.service.AuthorService;

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
}
