package com.skf.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.skf.domain.Blog;
import com.skf.service.AuthorService;
import com.skf.service.BlogService;

@Controller
public class CatalogController {
	@Resource
	BlogService blogService;
	@Resource
	AuthorService authorService;

	@RequestMapping(value = "java.action")
	public String viewJava(Model model) {
		List<Blog> blogs = blogService.getBlogsByAlias("java");
		if (blogs.size() > 5) {
			blogs = blogs.subList(0, 5);
		}
		for (Blog blog : blogs) {
			if (blog.getBlogContent().length() > 150) {
				blog.setBlogContent(blog.getBlogContent().substring(0, 150)
						+ "......");
			}
		}
		model.addAttribute("dataList", blogs);
		return "/JavaIndexList.jsp";
	}

	@RequestMapping(value = "android.action")
	public String viewAndroid(Model model) {
		List<Blog> blogs = blogService.getBlogsByAlias("android");
		if (blogs.size() > 5) {
			blogs = blogs.subList(0, 5);
		}
		for (Blog blog : blogs) {
			if (blog.getBlogContent().length() > 150) {
				blog.setBlogContent(blog.getBlogContent().substring(0, 150)
						+ "......");
			}
		}
		model.addAttribute("dataList", blogs);
		return "/AndroidIndexList.jsp";
	}

	@RequestMapping(value = "design.action")
	public String viewDesign(Model model) {
		List<Blog> blogs = blogService.getBlogsByAlias("design");
		if (blogs.size() > 5) {
			blogs = blogs.subList(0, 5);
		}
		for (Blog blog : blogs) {
			if (blog.getBlogContent().length() > 150) {
				blog.setBlogContent(blog.getBlogContent().substring(0, 150)
						+ "......");
			}
		}
		model.addAttribute("dataList", blogs);
		return "/DesignIndexList.jsp";
	}

	@RequestMapping(value = "other.action")
	public String viewOther(Model model) {
		List<Blog> blogs = blogService.getBlogsByAlias("other");
		if (blogs.size() > 5) {
			blogs = blogs.subList(0, 5);
		}
		for (Blog blog : blogs) {
			if (blog.getBlogContent().length() > 150) {
				blog.setBlogContent(blog.getBlogContent().substring(0, 150)
						+ "......");
			}
		}
		model.addAttribute("dataList", blogs);
		return "/OtherIndexList.jsp";
	}

	@RequestMapping(value = "life.action")
	public String viewLife(Model model) {
		List<Blog> blogs = blogService.getBlogsByAlias("life");
		if (blogs.size() > 5) {
			blogs = blogs.subList(0, 5);
		}
		for (Blog blog : blogs) {
			if (blog.getBlogContent().length() > 150) {
				blog.setBlogContent(blog.getBlogContent().substring(0, 150)
						+ "......");
			}
		}
		model.addAttribute("dataList", blogs);
		return "/LifeIndexList.jsp";
	}

	@RequestMapping(value = "work.action")
	public String viewWork(Model model) {
		List<Blog> blogs = blogService.getBlogsByAlias("work");
		if (blogs.size() > 5) {
			blogs = blogs.subList(0, 5);
		}
		for (Blog blog : blogs) {
			if (blog.getBlogContent().length() > 150) {
				blog.setBlogContent(blog.getBlogContent().substring(0, 150)
						+ "......");
			}
		}
		model.addAttribute("dataList", blogs);
		return "/WorkIndexList.jsp";
	}

	@RequestMapping(value = "about.action")
	public String viewAbout(Model model) {
		List<Blog> blogs = blogService.getBlogsByAlias("about");
		if (blogs.size() > 5) {
			blogs = blogs.subList(0, 5);
		}
		for (Blog blog : blogs) {
			if (blog.getBlogContent().length() > 150) {
				blog.setBlogContent(blog.getBlogContent().substring(0, 150)
						+ "......");
			}
		}
		model.addAttribute("dataList", blogs);
		return "/AboutIndexList.jsp";
	}
}
