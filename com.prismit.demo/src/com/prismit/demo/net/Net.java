package com.prismit.demo.net;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Net{ 
	public static void main(String a[]){ 
		 try {
			System.out.println(getData("https://www.w3schools.com/default.asp"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	
	
	
	
	
public static String getData(String address) throws Exception {
		String result = "";
	    URL page = new URL(address);
	    StringBuffer text = new StringBuffer();
	    HttpURLConnection conn = (HttpURLConnection) page.openConnection();
	    conn.connect();
	    InputStreamReader in = new InputStreamReader((InputStream) conn.getContent());
	    BufferedReader buff = new BufferedReader(in);
	    String line;
	    do {
	      line = buff.readLine();
	      System.out.println(line);
	      text.append(line + "\n");
	    } while (line != null);
	    return result;
	  }

 



}