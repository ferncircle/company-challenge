package com.company.challenge1.test.dao;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.company.challenge1.bean.Bean;
import com.company.challenge1.dao.Dao1;
import com.company.challenge1.test.AbstractServiceTest;


public class TestDao1 extends AbstractServiceTest{

	@Autowired
	private Dao1 dao;
	
	
	@Test
	public void testSolve(){
		assertNotNull(dao);
		
		Bean bean=dao.execute("strafawf@gmail.com");
		
		assertNotNull(bean);
		log.info("gameId="+bean.getGameId());
		
		
	}
}
