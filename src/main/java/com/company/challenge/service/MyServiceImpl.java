package com.company.challenge.service;

import javax.annotation.PostConstruct;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.company.challenge.dao.Dao;

@Service
public class MyServiceImpl implements MyService{
	public Logger log = Logger.getLogger(this.getClass());  
	
	@Value("${application.id}")
	private int appId;
	
	@Autowired
	@Qualifier("springRestDao")
	private Dao dao;
	
	@PostConstruct
	public void init(){	
		System.out.println("app id:"+appId);
	}
	
}
