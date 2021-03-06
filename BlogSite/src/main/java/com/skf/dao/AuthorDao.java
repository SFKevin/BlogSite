package com.skf.dao;

import com.skf.domain.Author;

public interface AuthorDao extends BaseDao<Author> {
	public Author getAuthorByUsername(String authorNickname);
}
