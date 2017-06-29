package com.skf.controller;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.skf.domain.Author;
import com.skf.service.AuthorService;

@Controller
public class AuthorController {
	@Resource
	AuthorService authorService;

	@RequestMapping(value = "/logining.action")
	public String logining() {
		return "/WEB-INF/pages/login.jsp";
	}

	@RequestMapping(value = "/login.action")
	public String login(HttpServletRequest request, Model model)
			throws IOException {
		request.setCharacterEncoding("UTF-8");
		String authorNickname = request.getParameter("username");
		String password = request.getParameter("password");
		Author author = authorService.getAuthorByUsername(authorNickname);
		if (author == null || !password.equals(author.getAuthorPassword())) {
			model.addAttribute("msg", "用户名或密码错误!");
			return "/WEB-INF/pages/login.jsp";
		} else {
			request.getSession().setAttribute("username", authorNickname);
			return "/index.jsp";
		}
	}

	@RequestMapping(value = "/regist.action")
	public String regist() {
		return "/WEB-INF/pages/regist.jsp";
	}

	@RequestMapping(value = "/registed.action")
	public String registed(Author author, HttpServletResponse response) {
		SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		author.setAuthorId(UUID.randomUUID().toString());
		author.setAuthorRegisterTime(date.format(new Date()));
		authorService.insert(author);
		return "/WEB-INF/pages/success.jsp";
	}

}
