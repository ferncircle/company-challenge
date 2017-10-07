package com.company.challenge.dao;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

@Component
public class JsonConverter {

	private Gson gson;

	@Value("${date.format}")
	private String dateFormat;
	
	
	@PostConstruct
	public void init(){
		gson =  new GsonBuilder().setDateFormat(dateFormat).create();
	}

	public Gson getGson() {
		return gson;
	}


	public void setGson(Gson gson) {
		this.gson = gson;
	}
}
