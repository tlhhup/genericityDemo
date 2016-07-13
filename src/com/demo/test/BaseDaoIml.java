package com.demo.test;

import java.util.List;

/**
 * 没有实例化的继承-->没有明确指定泛型参数类型
 * @author ping
 *
 * @param <T>
 */
public class BaseDaoIml<T> extends BaseDao<T> {

	@Override
	public void saveEntity(T t) {

	}

	@Override
	public void deleteEntity(T t) {

	}

	@Override
	public void updateEntity(T t) {

	}

	@Override
	public List<T> findAll() {
		return null;
	}

}
