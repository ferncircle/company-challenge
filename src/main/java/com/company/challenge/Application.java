package com.company.challenge;

import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.company.challenge.service.MyService;

@SpringBootApplication
public class Application implements CommandLineRunner{

	@Autowired
	private MyService service1;

	private final Logger log = LoggerFactory.getLogger(getClass());

	public static void main(String args[]) {
		SpringApplication.run(Application.class);
	}

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}

	/* (non-Javadoc)
	 * @see org.springframework.boot.CommandLineRunner#run(java.lang.String[])
	 * 
	 * 
	 * 	 */
	@Override
	public void run(String... args) throws Exception {
		Scanner sc=new Scanner(System.in);
		
		/*System.out.println("Please enter your input:");
		int n=sc.nextInt();
		System.out.println("you entered "+n);*/
		
		sc.close();
	}
}
