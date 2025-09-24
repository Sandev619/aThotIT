package com.Hash.set.Treeset;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
                          // converting HashSet into TreeSet
public class TreeSetDemo2 {

	public static void main(String[] args) {
	
	
		Set<Integer> hset1=new HashSet<>();//empty HashSet
		hset1.add(10);
		hset1.add(20);
		hset1.add(50);
		hset1.add(30);
		hset1.add(50);
		System.out.println(hset1);
		
		Set<Integer> tset2=new TreeSet<>(hset1);
		System.out.println(tset2);
}
}