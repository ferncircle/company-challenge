package com.company.challenge.test.dao;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.company.challenge.bean.Bean;
import com.company.challenge.dao.Dao;
import com.company.challenge.test.AbstractServiceTest;


public class TestDao extends AbstractServiceTest{

	@Autowired
	@Qualifier("springRestDao")
	private Dao dao;
	
	
	@Test
	public void testSolve(){
		assertNotNull(dao);
		
		Bean bean=dao.execute("strafawf@gmail.com");
		
		assertNotNull(bean);
		log.info("gameId="+bean.getGameId());
		
		
	}
}
