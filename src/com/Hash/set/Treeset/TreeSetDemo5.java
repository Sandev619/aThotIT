package com.Hash.set.Treeset;

import java.util.Set;
import java.util.TreeSet;
//sort on basis of length
public class TreeSetDemo5 {

	public static void main(String[] args) {
		
		
		Set<String> tset2=new TreeSet<>(new SortByLengthComparator2 ());
		tset2.add("deepa");
		tset2.add("mona");
		tset2.add("prakash");
		tset2.add("soojan");
		System.out.println(tset2);

		
		
		
		
		
		

}
}