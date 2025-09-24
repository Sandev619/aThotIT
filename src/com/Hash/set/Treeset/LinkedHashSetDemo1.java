package com.Hash.set.Treeset;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo1 {
//LinkedHashSet is ordered set ie , it maintain insertion sort order
	
	public static void main(String[] args) {
		Dog d1 =new Dog ("tommy",11,700);
		Dog d2 =new Dog ("jacky",11,500);
		Dog d3 =new Dog ("rommy",5,400);
		Dog d4 =new Dog ("tommy",11,700);
		
		//HashSet<Dog> hset1=new HashSet<>();
		//Set<Dog> hset1=new HashSet<>();		
		Set<Dog> hset1=new LinkedHashSet<>();
		hset1.add(d1);
		hset1.add(d2);
		hset1.add(d3);
		hset1.add(d4);
		System.out.print(hset1);// 3 dog only resulted when equals() is overriden,odwise 4 dogs resulted
	    
		
		
	}

}
