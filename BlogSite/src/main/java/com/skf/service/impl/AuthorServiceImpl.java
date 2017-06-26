package com.skf.service.impl;

import java.io.Serializable;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.skf.dao.AuthorDao;
import com.skf.domain.Author;
import com.skf.service.AuthorService;

@Service
public class AuthorServiceImpl implements AuthorService {
	@Resource
	AuthorDao authorDao;

	public Author get(Serializable id) {
		return authorDao.get(id);
	}

	public void insert(Author entity) {
		authorDao.insert(entity);
	}

	public void update(Author entity) {
		authorDao.update(entity);
	}

	public void deleteById(Serializable id) {
		authorDao.deleteById(id);
	}

}
