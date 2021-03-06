package com.skf.controller;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.skf.domain.Blog;
import com.skf.service.AuthorService;
import com.skf.service.BlogService;

@Controller
public class BlogController {
	@Resource
	BlogService blogService;
	@Resource
	AuthorService authorService;

	@RequestMapping(value = "/write.action")
	public String write(Blog blog, Model model, HttpServletRequest request)
			throws IOException {
		SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		request.setCharacterEncoding("utf-8");
		String username = (String) request.getSession()
				.getAttribute("username");
		blog.setAuthorId(authorService.getAuthorByUsername(username)
				.getAuthorId());
		// blog.setBlogId(UUID.randomUUID().toString());
		blog.setBlogCreatetime(date.format(new Date()));
		blogService.insert(blog);
		model.addAttribute("blog", blog);
		model.addAttribute("author", username);
		return "/WEB-INF/pages/blogview.jsp";

	}

	@RequestMapping(value = "indexList.action")
	public String sysmain(Model model) {
		List<Blog> blogs = blogService.getLatestBlog();
		for (Blog blog : blogs) {
			if (blog.getBlogContent().length() > 150) {
				blog.setBlogContent(blog.getBlogContent().substring(0, 150)
						+ "......");

			}
		}
		model.addAttribute("dataList", blogs);
		return "/indexList.jsp";
	}

	@RequestMapping(value = "view.action")
	public String view(int blog_Id, Model model) {
		Blog blog = blogService.get(blog_Id);
		String username = authorService.get(blog.getAuthorId())
				.getAuthorNickname();
		model.addAttribute("blog", blog);
		model.addAttribute("author", username);
		return "/WEB-INF/pages/blogview.jsp";
	}
}
