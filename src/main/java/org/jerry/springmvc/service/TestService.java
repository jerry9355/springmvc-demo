package org.jerry.springmvc.service;

import org.jerry.springmvc.dao.CityDao;
import org.jerry.springmvc.model.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {
	
	@Autowired
	private CityDao cityDao;
	
	
	public String generateName() {
		City city = cityDao.get(new Long(1));
		
		return city.getName();
	}

}
