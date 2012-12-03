package org.jerry.springmvc.service;

import org.springframework.stereotype.Service;

@Service
public class TestService {
	public String generateName() {
		return this.getClass().getName();
	}

}
