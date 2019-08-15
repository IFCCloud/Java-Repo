package com.test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;

public class connection {
	public static void main(String argv[]) {
		CloseableHttpClient httpclient = HttpClientBuilder.create().build();
		
		try {
			String authenticationInstance = "https://login.microsoftonline.com/";
			String tenantId = "5f57d9a8-c6c6-4fba-84be-cf5ce76059cc";
			String confidentialClientId = "696c4982-d209-4938-8540-5638f6ed820d";
			String key = "6SSuCDD8SuDEpAqINMp3py/edi4qyXq7HUKXuBngCUQ=";
			String clientId = "a873f7bb-6bc1-4b0c-a5e5-bfe4f8ee27a8";
			
			String url = authenticationInstance + tenantId + "/oauth2/token";
			
			List <NameValuePair> data = new ArrayList <NameValuePair>();
			data.add(new BasicNameValuePair("grant_type","client_credentials"));
			data.add(new BasicNameValuePair("client_id","3159ae5f-4543-44e8-afd9-b0d621b61cd3"));
			data.add(new BasicNameValuePair("client_secret","qS98fBvgAZ5AMdOLF+tBrT5tk/m/+uamhPkyPB87mxM="));
			data.add(new BasicNameValuePair("resource","25d40931-abdc-4235-9fcd-50aabf1b4d59"));
			data.add(new BasicNameValuePair("Content-Type","application/x-www-form-urlencoded"));
			
			HttpPost httpPost = new HttpPost(url);
			try {
				httpPost.setEntity(new UrlEncodedFormEntity(data));	
				
				System.out.println("Executing request: " + httpPost.getRequestLine());
				CloseableHttpResponse response2 = httpclient.execute(httpPost);
				try {
				    System.out.println(response2.getStatusLine());
				    HttpEntity entity2 = response2.getEntity();
				    
				    
				    //convert to json				    
				    JSONObject jsonObj = new JSONObject(EntityUtils.toString(response2.getEntity()));				    		
				    System.out.println(jsonObj.get("access_token"));
				    
				    // and ensure it is fully consumed
				    EntityUtils.consume(entity2);  
				    
				} finally {
				    response2.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		} finally {
			try {
				httpclient.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
