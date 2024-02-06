package com.example;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;   

public class WelcomeClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
			URL url= new URL("http://localhost:8082/welcomeMsg");
			
			//established connection between client application and resource
			HttpURLConnection connection=(HttpURLConnection) url.openConnection();
			connection.setRequestMethod("GET");
			
			int responseCode = connection.getResponseCode();
			if(responseCode==200) {
				InputStream inputStream = connection.getInputStream();
				InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
				BufferedReader br=new BufferedReader(inputStreamReader);
				String line = br.readLine();
				
				while(line!=null) {
					System.out.println(line);
					line=br.readLine();
				}
				connection.disconnect();
			}
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
