package com.company.challenge.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.company.challenge.test.dao.TestDao;
import com.company.challenge.test.service.TestMyService;

@RunWith(Suite.class)

@Suite.SuiteClasses({
   TestDao.class,
   TestMyService.class
})
public class TestSuite {

}
