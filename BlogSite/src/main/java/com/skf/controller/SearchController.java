package com.skf.controller;

import java.io.IOException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.skf.domain.Blog;
import com.skf.service.BlogService;
import com.skf.util.FenciUtil;

@Controller
public class SearchController {
	@Resource
	BlogService blogService;
	private static int pageSize = 10;

	@RequestMapping(value = "search.action")
	public String search(HttpServletRequest request, Model model)
			throws IOException {
		String query = request.getParameter("query");
		if (query.isEmpty()) {
			return "indexList.jsp";
		}
		query = URLDecoder.decode(query, "UTF-8");
		List<String> keyList = new ArrayList<String>();
		FenciUtil.fenci(query, keyList);
		List<Blog> blogs = new ArrayList<Blog>();
		blogs = blogService.search(keyList);
		if (blogs.size() > pageSize) {
			blogs = blogs.subList(0, pageSize);
		}
		for (Blog blog : blogs) {
			if (blog.getBlogContent().length() > 150) {
				blog.setBlogContent(blog.getBlogContent().substring(0, 150)
						+ "......");
			}
		}
		model.addAttribute("dataList", blogs);
		return "indexList.jsp";
	}

}
