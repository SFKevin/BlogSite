package com.skf.dao.impl;

import java.io.Serializable;

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

}
