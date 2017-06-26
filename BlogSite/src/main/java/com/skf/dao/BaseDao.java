package com.skf.dao;

import java.io.Serializable;

public interface BaseDao<T> {
	public T get(Serializable id);

	public void insert(T entity);

	public void update(T entity);

	public void deleteById(Serializable id);
}
