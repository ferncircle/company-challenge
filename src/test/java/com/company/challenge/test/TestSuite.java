package com.company.challenge.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.company.challenge.test.dao.TestHttpClientDao;
import com.company.challenge.test.dao.TestSpringRestDao;
import com.company.challenge.test.service.TestMyService;

@RunWith(Suite.class)

@Suite.SuiteClasses({
   TestHttpClientDao.class,
   TestSpringRestDao.class,
   TestMyService.class
})
public class TestSuite {

}
