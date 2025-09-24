package com.Hashcode;

import java.util.HashSet;
import java.util.Set;

public class HashsetDemo1 {

public static void main(String[] args) {
		
	Set<Integer>hset1 =new HashSet<>();     //blank
		      System.out.println(hset1);		    
	   hset1.add(10);
	   hset1.add(20);
	   hset1.add(30);
	   hset1.add(10);
		    System.out.println(hset1);
		    
	Set<String>hset2= new HashSet<>(); //blank
	          System.out.println(hset2);
	   hset2.add("mango");
	   hset2.add("apple");
	   hset2.add("cherry");
	   hset2.add("orange");
	   hset2.add("mango");
	         System.out.println(hset2);
	   
	   
		

		

	}

}
