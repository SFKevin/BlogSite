package com.skf.servlet;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.skf.domain.Author;
import com.skf.service.AuthorService;

/**
 * Servlet implementation class VolidateServlet
 */
public class VolidateServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public VolidateServlet() {
		super();
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		AuthorService authorService = (AuthorService) ctx
				.getBean("authorServiceImpl");
		request.setCharacterEncoding("UTF-8");
		String authorNickname = request.getParameter("authorNickname");
		Author author = authorService.getAuthorByUsername(authorNickname);
		Map<String, String> map = new HashMap<String, String>();
		if (author != null) {
			author.setAuthorPassword(null);
			map.put("authorNickname", author.getAuthorNickname());
			JSONArray authorArray = JSONArray.fromObject(map);
			response.getWriter().print(authorArray.toString());
		} else {
			map.put("authorNickname", null);
			JSONArray authorArray = JSONArray.fromObject(map);
			response.getWriter().print(authorArray.toString());
		}
	}

}
