package com.company.challenge.dao;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

import javax.annotation.PostConstruct;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.ParseException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.company.challenge.bean.Bean;
import com.google.gson.JsonSyntaxException;

@Service("httpClientDao")
public class HttpClientDao implements Dao{

	private final Logger log = LoggerFactory.getLogger(getClass());
	

	private CloseableHttpClient client;
	private PoolingHttpClientConnectionManager cm;

	HttpClientContext context;

	@Autowired
	private JsonConverter jsonConverter;

	@Value("${data.point.url}")
	private String dataPointUrl;
	
	@PostConstruct
	public void init(){

		cm = new PoolingHttpClientConnectionManager();
		// Increase max total connection to 200
		cm.setMaxTotal(200);
		// Increase default max connection per route to 20
		cm.setDefaultMaxPerRoute(20);
		client = HttpClients.custom()
				.setConnectionManager(cm)
				.build();
		
		context = HttpClientContext.create();
	}
	public Bean execute(String email){
		
		String url=dataPointUrl;
				
		Bean bean=null;
		
		try {
			HttpPost request = new HttpPost(url);

			ArrayList<NameValuePair> postParameters = new ArrayList<NameValuePair>();
			postParameters.add(new BasicNameValuePair("email", email));
			request.setEntity(new UrlEncodedFormEntity(postParameters));

			HttpResponse response = client.execute(request, context);

			
			HttpEntity entity = response.getEntity();
			String content=EntityUtils.toString(entity);
			bean = jsonConverter.getGson().fromJson(content, Bean.class);
		} catch (JsonSyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClientProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return bean;
	}
	
}
