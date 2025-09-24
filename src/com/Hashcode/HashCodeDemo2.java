package com.Hashcode;

public class HashCodeDemo2 {

	public static void main(String[] args) {
		
		Dog dog1=new Dog();
		Dog dog2=new Dog();
		
		
		System.out.println(dog1.equals(dog2)); // false  if equals is not overriden
		                                       // hascode will be same if hascode is overriden
		
		System.out.println(dog1.hashCode());
		
		System.out.println(dog2.hashCode());

	}

}
