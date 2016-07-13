package com.demo.test;

import java.util.List;

public abstract class BaseDao<T> {//定义泛型类--->类名<T>

	public abstract void saveEntity(T t);

	public abstract void deleteEntity(T t);

	public abstract void updateEntity(T t);

	public abstract List<T> findAll();

}
