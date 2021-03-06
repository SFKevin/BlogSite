package com.skf.dao.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.skf.dao.BlogDao;
import com.skf.domain.Blog;
import com.skf.domain.BlogVO;

@Repository
public class BlogDaoImpl extends BaseDaoImpl<Blog> implements BlogDao {
	public BlogDaoImpl() {
		super.setNs("com.skf.jk.mapper.BlogMapper");
	}

	public BlogVO getBlogVO(Serializable id) {
		return this.getSqlSession().selectOne(super.getNs() + ".getBlogVO", id);
	}

	public List<Blog> getLatestBlog() {
		return this.getSqlSession()
				.selectList(super.getNs() + ".getLatestBlog");
	}

	public List<Blog> getBlogsByAlias(String blogColumnAlias) {
		return this.getSqlSession().selectList(
				super.getNs() + ".getBlogsByAlias", blogColumnAlias);
	}

	public List<Blog> getAllBlog() {
		return this.getSqlSession().selectList(super.getNs() + ".getAllBlog");
	}

	public List<Blog> search(List<String> list) {
		return this.getSqlSession().selectList(super.getNs() + ".search", list);
	}

}
