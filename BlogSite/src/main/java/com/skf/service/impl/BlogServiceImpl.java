package com.skf.service.impl;

import java.io.Serializable;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.skf.dao.BlogDao;
import com.skf.domain.Blog;
import com.skf.domain.BlogVO;
import com.skf.service.BlogService;

@Service
public class BlogServiceImpl implements BlogService {
	@Resource
	BlogDao blogDao;

	public Blog get(Serializable id) {
		return blogDao.get(id);
	}

	public BlogVO getBlogVO(Serializable id) {
		return blogDao.getBlogVO(id);
	}

	public void insert(Blog entity) {
		blogDao.insert(entity);
	}

	public void update(Blog entity) {
		blogDao.update(entity);
	}

	public void deleteById(Serializable id) {
		blogDao.deleteById(id);
	}

	public List<Blog> getLatestBlog() {
		return blogDao.getLatestBlog();
	}

	public List<Blog> getBlogsByAlias(String blogColumnAlias) {
		return blogDao.getBlogsByAlias(blogColumnAlias);
	}

	public List<Blog> getAllBlog() {
		return blogDao.getAllBlog();
	}

	public List<Blog> search(List<String> list) {
		return blogDao.search(list);
	}
}
