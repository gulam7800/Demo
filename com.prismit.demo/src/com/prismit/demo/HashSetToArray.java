package com.prismit.demo;
import java.util.HashSet;

public class HashSetToArray {
 
    public static void main(String a[]){
        HashSet<String> hs = new HashSet<String>();
        hs.add("first");
        hs.add("second");
        hs.add("third");
        System.out.println("HashSet ");
        System.out.println(hs);
        String[] strArr = new String[hs.size()];
        hs.toArray(strArr);
        System.out.println("Copied array ");
        for(String str:strArr){
            System.out.println(str);
        }
    }
}