package com.Hash.set.Treeset;


import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo1 {

	public static void main(String[] args) {
	
	
	Set<Integer> tset1=new TreeSet<>();//empty HashSet
	tset1.add(10);
	tset1.add(20);
	tset1.add(50);
	tset1.add(30);
	tset1.add(50);
	System.out.println(tset1);
	
	Set<String> tset2= new TreeSet<>();
	tset2.add("deepa");
	tset2.add("ram");
	tset2.add("sam");
	tset2.add("sita");
	tset2.add("rita");
	System.out.println(tset2);

}
}