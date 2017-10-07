package com.company.challenge1.test.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.company.challenge1.dao.DaoImpl1;
import com.company.challenge1.test.AbstractServiceTest;


public class TestService2 extends AbstractServiceTest{

	@Autowired
	private DaoImpl1 service2;
	
}
