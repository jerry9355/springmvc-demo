package service;

import org.jerry.springmvc.service.TestService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring.xml")
public class ServiceTest {
	
	
	
	@Autowired
	private TestService service;
	
	@Test
	public void getName() {
		String cityName = service.generateName();
		Assert.assertNotNull(cityName);
		
	}
}
