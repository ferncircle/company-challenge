package com.company.challenge1.service;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.company.challenge1.dao.Dao1;

@Service
public class Service1Impl implements Service1{
	private static final Logger log = LoggerFactory.getLogger(Service1Impl.class);
	
	@Value("${application.id}")
	private int appId;
	
	@Autowired
	private Dao1 dao;
	
	@PostConstruct
	public void init(){	
		System.out.println("app id:"+appId);
	}
	
}
