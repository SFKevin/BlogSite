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
public class PageController {
	@Resource
	BlogService blogService;
	@Resource
	AuthorService authorService;
	private static int pageSize = 10;

	@RequestMapping(value = "indexAll.action")
	public String indexAll(int pageNo, Model model) {
		List<Blog> blogs = blogService.getAllBlog();
		int begin = (pageNo - 1) * pageSize;
		int end = pageNo * pageSize;
		if (end > blogs.size()) {
			end = blogs.size();
		}
		int maxPage = (blogs.size() + 9) / 10;
		blogs = blogs.subList(begin, end);
		for (Blog blog : blogs) {
			if (blog.getBlogContent().length() > 150) {
				blog.setBlogContent(blog.getBlogContent().substring(0, 150)
						+ "......");
			}
		}
		model.addAttribute("dataList", blogs);
		model.addAttribute("maxPage", maxPage);
		model.addAttribute("pageNo", pageNo);
		return "AllindexList.jsp";
	}

	@RequestMapping(value = "javaAll.action")
	public String javaAll(int pageNo, Model model) {
		List<Blog> blogs = blogService.getBlogsByAlias("java");
		int begin = (pageNo - 1) * pageSize;
		int end = pageNo * pageSize;
		if (end > blogs.size()) {
			end = blogs.size();
		}
		int maxPage = (blogs.size() + 9) / 10;
		blogs = blogs.subList(begin, end);
		for (Blog blog : blogs) {
			if (blog.getBlogContent().length() > 150) {
				blog.setBlogContent(blog.getBlogContent().substring(0, 150)
						+ "......");
			}
		}
		model.addAttribute("dataList", blogs);
		model.addAttribute("maxPage", maxPage);
		model.addAttribute("pageNo", pageNo);
		return "AllJavaIndexList.jsp";
	}

	@RequestMapping(value = "androidAll.action")
	public String androidAll(int pageNo, Model model) {
		List<Blog> blogs = blogService.getBlogsByAlias("android");
		int begin = (pageNo - 1) * pageSize;
		int end = pageNo * pageSize;
		if (end > blogs.size()) {
			end = blogs.size();
		}
		int maxPage = (blogs.size() + 9) / 10;
		blogs = blogs.subList(begin, end);
		for (Blog blog : blogs) {
			if (blog.getBlogContent().length() > 150) {
				blog.setBlogContent(blog.getBlogContent().substring(0, 150)
						+ "......");
			}
		}
		model.addAttribute("dataList", blogs);
		model.addAttribute("maxPage", maxPage);
		model.addAttribute("pageNo", pageNo);
		return "AllAndroidIndexList.jsp";
	}

	@RequestMapping(value = "designAll.action")
	public String designAll(int pageNo, Model model) {
		List<Blog> blogs = blogService.getBlogsByAlias("design");
		int begin = (pageNo - 1) * pageSize;
		int end = pageNo * pageSize;
		if (end > blogs.size()) {
			end = blogs.size();
		}
		int maxPage = (blogs.size() + 9) / 10;
		blogs = blogs.subList(begin, end);
		for (Blog blog : blogs) {
			if (blog.getBlogContent().length() > 150) {
				blog.setBlogContent(blog.getBlogContent().substring(0, 150)
						+ "......");
			}
		}
		model.addAttribute("dataList", blogs);
		model.addAttribute("maxPage", maxPage);
		model.addAttribute("pageNo", pageNo);
		return "AllDesignIndexList.jsp";
	}

	@RequestMapping(value = "otherAll.action")
	public String otherAll(int pageNo, Model model) {
		List<Blog> blogs = blogService.getBlogsByAlias("other");
		int begin = (pageNo - 1) * pageSize;
		int end = pageNo * pageSize;
		if (end > blogs.size()) {
			end = blogs.size();
		}
		int maxPage = (blogs.size() + 9) / 10;
		blogs = blogs.subList(begin, end);
		for (Blog blog : blogs) {
			if (blog.getBlogContent().length() > 150) {
				blog.setBlogContent(blog.getBlogContent().substring(0, 150)
						+ "......");
			}
		}
		model.addAttribute("dataList", blogs);
		model.addAttribute("maxPage", maxPage);
		model.addAttribute("pageNo", pageNo);
		return "AllOtherIndexList.jsp";
	}

	@RequestMapping(value = "lifeAll.action")
	public String lifeAll(int pageNo, Model model) {
		List<Blog> blogs = blogService.getBlogsByAlias("life");
		int begin = (pageNo - 1) * pageSize;
		int end = pageNo * pageSize;
		if (end > blogs.size()) {
			end = blogs.size();
		}
		int maxPage = (blogs.size() + 9) / 10;
		blogs = blogs.subList(begin, end);
		for (Blog blog : blogs) {
			if (blog.getBlogContent().length() > 150) {
				blog.setBlogContent(blog.getBlogContent().substring(0, 150)
						+ "......");
			}
		}
		model.addAttribute("dataList", blogs);
		model.addAttribute("maxPage", maxPage);
		model.addAttribute("pageNo", pageNo);
		return "AllLifeIndexList.jsp";
	}

	@RequestMapping(value = "workAll.action")
	public String workAll(int pageNo, Model model) {
		List<Blog> blogs = blogService.getBlogsByAlias("work");
		int begin = (pageNo - 1) * pageSize;
		int end = pageNo * pageSize;
		if (end > blogs.size()) {
			end = blogs.size();
		}
		int maxPage = (blogs.size() + 9) / 10;
		blogs = blogs.subList(begin, end);
		for (Blog blog : blogs) {
			if (blog.getBlogContent().length() > 150) {
				blog.setBlogContent(blog.getBlogContent().substring(0, 150)
						+ "......");
			}
		}
		model.addAttribute("dataList", blogs);
		model.addAttribute("maxPage", maxPage);
		model.addAttribute("pageNo", pageNo);
		return "AllWorkIndexList.jsp";
	}

	@RequestMapping(value = "aboutAll.action")
	public String aboutAll(int pageNo, Model model) {
		List<Blog> blogs = blogService.getBlogsByAlias("about");
		int begin = (pageNo - 1) * pageSize;
		int end = pageNo * pageSize;
		if (end > blogs.size()) {
			end = blogs.size();
		}
		int maxPage = (blogs.size() + 9) / 10;
		blogs = blogs.subList(begin, end);
		for (Blog blog : blogs) {
			if (blog.getBlogContent().length() > 150) {
				blog.setBlogContent(blog.getBlogContent().substring(0, 150)
						+ "......");
			}
		}
		model.addAttribute("dataList", blogs);
		model.addAttribute("maxPage", maxPage);
		model.addAttribute("pageNo", pageNo);
		return "AllAboutIndexList.jsp";
	}
}
