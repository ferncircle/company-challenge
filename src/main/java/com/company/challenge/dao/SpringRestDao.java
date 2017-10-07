package com.company.challenge.dao;

import org.apache.log4j.Logger;
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

	public Logger log = Logger.getLogger(this.getClass());  

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
