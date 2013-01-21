package dao;

import javax.annotation.Resource;

import org.jerry.springmvc.dao.CityDao;
import org.jerry.springmvc.model.City;
import org.junit.Assert;
import org.junit.Test;

import base.BaseTest;


public class DaoTest extends BaseTest{
	
	@Resource
	private CityDao cityDao;
	

	@Test
	public void getCity() {
		City city = cityDao.get(new Long(1));
		Assert.assertNotNull(city);
		
	}

}
