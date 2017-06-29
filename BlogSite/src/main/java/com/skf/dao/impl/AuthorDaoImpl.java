package com.skf.dao.impl;

import org.springframework.stereotype.Repository;

import com.skf.dao.AuthorDao;
import com.skf.domain.Author;

@Repository
public class AuthorDaoImpl extends BaseDaoImpl<Author> implements AuthorDao {
	public AuthorDaoImpl() {
		super.setNs("com.skf.jk.mapper.AuthorMapper");
	}

	public Author getAuthorByUsername(String authorNickname) {
		return super.getSqlSession().selectOne(
				super.getNs() + ".getAuthorByUsername", authorNickname);
	}
}
