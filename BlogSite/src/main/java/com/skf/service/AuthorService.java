package com.skf.service;

import java.io.Serializable;

import com.skf.domain.Author;

public interface AuthorService {
	public Author get(Serializable id);

	public void insert(Author entity);

	public void update(Author entity);

	public void deleteById(Serializable id);

	public Author getAuthorByUsername(String username);
}
