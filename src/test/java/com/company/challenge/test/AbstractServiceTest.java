package com.company.challenge.test;

import org.apache.log4j.Logger;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.company.challenge.Application;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {Application.class})
@ContextConfiguration(classes=TestConfig.class)
public class AbstractServiceTest {

	public Logger log = Logger.getLogger(this.getClass());  
}
