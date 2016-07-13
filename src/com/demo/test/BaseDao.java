package com.demo.test;

import java.util.List;

public abstract class BaseDao<T> {//���巺����--->����<T>

	public abstract void saveEntity(T t);

	public abstract void deleteEntity(T t);

	public abstract void updateEntity(T t);

	public abstract List<T> findAll();

}
