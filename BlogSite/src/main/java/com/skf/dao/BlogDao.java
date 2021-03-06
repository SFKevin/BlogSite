package com.skf.dao;

import java.io.Serializable;
import java.util.List;

import com.skf.domain.Blog;
import com.skf.domain.BlogVO;

public interface BlogDao extends BaseDao<Blog> {
	public BlogVO getBlogVO(Serializable id);

	public List<Blog> getLatestBlog();

	public List<Blog> getBlogsByAlias(String blogColumnAlias);

	public List<Blog> getAllBlog();

	public List<Blog> search(List<String> list);
}
