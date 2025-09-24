package com.Hashcode;

public class HashCodeDemo1 {

	public static void main(String[] args) {
		
		String s1 = new String("Donald");
		    System.out.println(s1.hashCode());
		    System.out.println(s1.hashCode());
	     	System.out.println(s1.hashCode());
		
		
		String s2 =new String ("Donald");	
	     	System.out.println(s2.hashCode());
	     	
	    String s3 =new String ("Donald");
	        System.out.println(s3.hashCode());

	}

}
