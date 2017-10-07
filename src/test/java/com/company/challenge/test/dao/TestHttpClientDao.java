package com.company.challenge.test.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.company.challenge.dao.Dao;

public class TestHttpClientDao extends TestDao{


	@Autowired
	@Qualifier("httpClientDao")
	private Dao dao;

	@Override
	public Dao getDao() {
		return dao;
	}
}
