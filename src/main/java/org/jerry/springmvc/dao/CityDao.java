package org.jerry.springmvc.dao;

import java.util.List;

import org.jerry.springmvc.model.City;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

@Repository
public class CityDao extends SqlSessionDaoSupport implements BaseDao<City>{
	
	static final String MAPPER_NAME = "CityMapper.";
	

	public void save(City t) {
		// TODO Auto-generated method stub
		getSqlSession().insert(MAPPER_NAME + "insert", t);
	}

	public void delete(City t) {
		// TODO Auto-generated method stub
		getSqlSession().delete(MAPPER_NAME + "delete", t);
	}

	public City get(Object object) {
		// TODO Auto-generated method stub
		return (City) getSqlSession().selectOne(MAPPER_NAME + "get", object);
	}

	@SuppressWarnings("unchecked")
	public List<City> getList(Object params) {
		// TODO Auto-generated method stub
		return getSqlSession().selectList(MAPPER_NAME + "search", params);
	}


	
	
	

}
