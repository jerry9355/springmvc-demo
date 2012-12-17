package dao;

import org.jerry.springmvc.dao.CityDao;
import org.jerry.springmvc.model.City;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class DaoTest {
	
	private static CityDao cityDao;
	
	@BeforeClass
	public static void init() {
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("classpath:spring/spring.xml");
		
		cityDao = (CityDao) context.getBean("cityDao");
	}
	
	@Test
	public void getCity() {
		City city = cityDao.get(new Long(0));
		Assert.assertNotNull(city);
		
	}

}
