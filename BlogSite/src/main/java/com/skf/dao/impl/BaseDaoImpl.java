package com.skf.dao.impl;

import java.io.Serializable;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;

import com.skf.dao.BaseDao;

public class BaseDaoImpl<T> extends SqlSessionDaoSupport implements BaseDao<T> {
	@Override
	@Autowired
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		super.setSqlSessionFactory(sqlSessionFactory);
	};

	private String ns;

	public String getNs() {
		return ns;
	}

	public void setNs(String ns) {
		this.ns = ns;
	}

	public T get(Serializable id) {
		return this.getSqlSession().selectOne(ns + ".get", id);
	}

	public void insert(T entity) {
		this.getSqlSession().insert(ns + ".insert", entity);
	}

	public void update(T entity) {
		this.getSqlSession().update(ns + ".update", entity);
	}

	public void deleteById(Serializable id) {
		this.getSqlSession().delete(ns + ".deleteById", id);
	}

}
