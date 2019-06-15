package com.prismit.demo;

public class Checl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1= new Employee(101,"vara",1000);
		Employee		e2=e1;
		System.out.println(e1.equals(e2));
		
		Employee e3= new Employee(102,"vara",2000);
		Employee e4= new Employee(102,"vara",2000);
		System.out.println(e3.equals(e4));


	}

}
