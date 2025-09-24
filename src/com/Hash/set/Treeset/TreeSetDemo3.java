package com.Hash.set.Treeset;


import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
//sorting TreeSet In descending order using comparator
public class TreeSetDemo3 {

	public static void main(String[] args) {
		
		
		Set<Integer> tset1=new TreeSet<>();//empty HashSet
		tset1.add(10);
		tset1.add(20);
		tset1.add(50);
		tset1.add(30);
		tset1.add(50);
		System.out.println(tset1);//[10, 20, 30, 50]
		
		
		Set<Integer> sortDescending =new TreeSet<>(new SortingInDecendingComparator());
		sortDescending.addAll(tset1);
		System.out.println(sortDescending);
		//Collections.sort(tset1);//Collections.sort() is only for List
		

}
}