package com.company.challenge.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import com.company.challenge.bean.Bean;

@Service("springRestDao")
public class SpringRestDao implements Dao{

	private final Logger log = LoggerFactory.getLogger(getClass());
	

	@Autowired
	private RestTemplate restTemplate;
	
	@Value("${data.point.url}")
	private String dataPointUrl;
	
	public Bean execute(String email){
		
		String url=dataPointUrl;
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);

		
		MultiValueMap<String, String> map= new LinkedMultiValueMap<String, String>();
		map.add("email", email);

		HttpEntity<MultiValueMap<String, String>> request = new HttpEntity<MultiValueMap<String, String>>(map, headers);

		ResponseEntity<Bean> response = restTemplate.postForEntity( url, request , Bean.class );
		
		
		return response.getBody();
	}
	
}
