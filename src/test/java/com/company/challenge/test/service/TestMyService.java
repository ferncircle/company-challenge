package com.company.challenge.test.service;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.company.challenge.service.MyService;
import com.company.challenge.test.AbstractServiceTest;


public class TestMyService extends AbstractServiceTest{

	@Autowired
	private MyService service1;
	
	
	@Test
	public void testSolve(){
		assertNotNull(service1);
			
		
	}
}
