package com.company.challenge1.test.service;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.company.challenge1.service.Service1;
import com.company.challenge1.test.AbstractServiceTest;


public class TestService1 extends AbstractServiceTest{

	@Autowired
	private Service1 service1;
	
	
	@Test
	public void testSolve(){
		assertNotNull(service1);
			
		
	}
}
