package com.company.challenge.test.dao;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import com.company.challenge.bean.Bean;
import com.company.challenge.dao.Dao;
import com.company.challenge.test.AbstractServiceTest;


public abstract class TestDao extends AbstractServiceTest{

	
	public abstract Dao getDao();
	
	@Test
	public void testSolve(){		
		Bean bean=getDao().execute("strafawf@gmail.com");
		
		assertNotNull(bean);
		log.info("gameId="+bean.getGameId());
		
		
	}
}
