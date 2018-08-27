package com.dp.DesignPatterns.dataAccess;

public interface BaseDAO<E, K> {
	public void create(E entity);

	public E retrieve(K id);

	public void update(E entity);

	public void delete(K id);
}
