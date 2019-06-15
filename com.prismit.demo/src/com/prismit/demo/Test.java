package com.prismit.demo;

import java.io.InputStream;
import java.net.URI;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1= new Employee(101,"vara",1000);
		Employee e2= new Employee(102,"vara",2000);
		Employee e3= new Employee(101,"vara",1000);
		System.out.println(e1==e2);
		System.out.println(e1.equals(e2));
		System.out.println(e1==e3);
		System.out.println(e1.equals(e3));

		
		
		
		URI url = null;
		        InputStream is = null;
		        try {
		            url = new URI("http://www.java2novice.com");
		            is = url.openStream();
		            byte[] b = new byte[8];
		            while(is.read(b) != -1){
		                System.out.print(new String(b));
		            }
		        }  catch (MalformedURLException ex) {
		            ex.printStackTrace();
		        } catch (IOException ex) {
		            ex.printStackTrace();
		        }

	}

}
