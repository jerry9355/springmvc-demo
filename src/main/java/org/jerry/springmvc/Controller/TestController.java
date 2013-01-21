package org.jerry.springmvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.jerry.springmvc.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestController {
	@Autowired
	private TestService testService;
	
	@RequestMapping(value = "/index.do", method = { RequestMethod.GET, RequestMethod.POST })
	public String index(ModelMap model, HttpServletRequest request) {
		String name = testService.generateName();
		model.put("cityName", name);
//		request.setAttribute("cityName", name);
		return "index";
	} 

}
