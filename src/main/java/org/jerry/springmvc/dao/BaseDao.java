package org.jerry.springmvc.dao;

import java.util.List;

/**
 * The interface for all the Dao
 * 
 * @author Jerry Weng
 * @since 2012-12-11
 * @param <T>
 * 			the Entity
 */
public interface BaseDao<T> {
	
	/**
	 * Save the entity
	 * 
	 * @author Jerry Weng
	 * @param t
	 * 			the entity
	 */
	void save(T t);
	
	/**
	 * Delete the entity
	 * 
	 * @author Jerry Weng
	 * @param t
	 * 			the entity
	 */
	void delete(T t);
	
	/**
	 * Get the entity by id
	 * 
	 * @author Jerry Weng
	 * @param id
	 * @return T
	 * 			the entity
	 */
	T get(Object id);
	
	/**
	 * Get a list of the entity
	 * 
	 * @author Jerry Weng
	 * @param params
	 * @return List<T>
	 * 			the list of the entity
	 */
	List<T> getList(Object params);
	

}
