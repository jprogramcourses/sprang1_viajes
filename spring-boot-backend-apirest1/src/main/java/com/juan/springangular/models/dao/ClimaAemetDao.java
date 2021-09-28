package com.juan.springangular.models.dao;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;

import org.springframework.stereotype.Repository;

@Repository
public class ClimaAemetDao {
	
	private static final String API_KEY = "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJqdWFuZGlzYW5qQHlhaG9vLmVzIiwianRpIjoiZDBlZmUyYzgtYTIyNy00NjAzLTg2YTUtOTU1YTUwZjI4NGYwIiwiaXNzIjoiQUVNRVQiLCJpYXQiOjE2MjkxMDg3MzgsInVzZXJJZCI6ImQwZWZlMmM4LWEyMjctNDYwMy04NmE1LTk1NWE1MGYyODRmMCIsInJvbGUiOiIifQ.aolfdBKbzRqe06-m9JuqwGX2nAUptM8R4fAekj2c0oI";
	
	public void getDatosAemet() {
		
		URL url = null;
		try {
//			url = new URL("https://opendata.aemet.es/opendata/sh/960e5ccf");
			url = new URL("http://api.plos.org/search?q=title:DNA");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		HttpURLConnection conn = null;
		try {
			conn = (HttpURLConnection) url.openConnection();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			conn.setRequestMethod("GET");
		} catch (ProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		int responseCode = -1;
		try {
			conn.connect();
			responseCode = conn.getResponseCode();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
