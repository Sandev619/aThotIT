package com.Hash.set.Treeset;

import java.util.Set;
import java.util.TreeSet;

import javax.swing.plaf.synth.SynthOptionPaneUI;
//sort on basis of length
public class TreeSetDemo4 {

	public static void main(String[] args) {
		
		//  sorting name in desending alphabet way
		Set<String> tset2=new TreeSet<>(new SortByLengthComparator ());
		tset2.add("deepa");
		tset2.add("mona");
		tset2.add("prakash");
		tset2.add("soojan");
		System.out.println(tset2);
		
		System.out.println("----");

        // sorting name in ascending alphabet way
		Set<String> tset3=new TreeSet<>(new SortByLengthComparator2 ());
		tset3.add("deepa");
		tset3.add("mona");
		tset3.add("prakash");
		tset3.add("soojan");
		System.out.println(tset3);

		
		
		
		
		

}
}