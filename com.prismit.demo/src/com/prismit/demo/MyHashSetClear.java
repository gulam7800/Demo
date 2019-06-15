package com.prismit.demo;

import java.util.HashSet;
import java.util.Set;
public class MyHashSetClear {
	 
    public static void main(String a[]){
        Set<String> hs = new HashSet<String>();
        hs.add("first");
        hs.add("second");
        hs.add("third");
        System.out.println("My HashSet");
        System.out.println(hs);
        System.out.println("Clearing HashSet:");
        hs.clear();
        System.out.println(" After clear:");
        System.out.println(hs);

	}
}