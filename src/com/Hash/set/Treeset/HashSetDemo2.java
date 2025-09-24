package com.Hash.set.Treeset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo2 {

	public static void main(String[] args) {
		
		Set<Integer>hset1=new HashSet<>();
		hset1.add(10);
		hset1.add(20);
		hset1.add(50);
		hset1.add(30);
		hset1.add(50);
		System.out.println(hset1);
		
		//using for each loop
		for (Integer element:hset1 ) {
			System.out.println(element);
		}
		//using for loop === not posiible
		System.out.println(" ----------   ");
		
		//using Iterator
		Iterator<Integer> itr=hset1.iterator();
		while (itr.hasNext()) {
			Integer i = itr.next();
			System.out.println(i);
		}
		
		
		
	}

}
