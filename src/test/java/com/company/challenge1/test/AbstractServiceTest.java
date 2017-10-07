package com.company.challenge1.test;

import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.company.challenge1.Application;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {Application.class})
@ContextConfiguration(classes=TestConfig.class)
public class AbstractServiceTest {

	protected static final Logger log = LoggerFactory.getLogger(AbstractServiceTest.class);
}
