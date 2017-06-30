package com.skf.service;

import java.io.Serializable;

import com.skf.domain.Blog;
import com.skf.domain.BlogVO;

public interface BlogService {
	public Blog get(Serializable id);

	public BlogVO getBlogVO(Serializable id);

	public void insert(Blog entity);

	public void update(Blog entity);

	public void deleteById(Serializable id);
}