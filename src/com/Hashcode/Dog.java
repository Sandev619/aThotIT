package com.Hashcode;

import java.util.Objects;

public class Dog {

	String name ="tommy";
	int age     =12;		
	String Color="black";
	
	
	@Override
	public int hashCode() {
		return Objects.hash(Color, age, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dog other = (Dog) obj;
		return Objects.equals(Color, other.Color) && age == other.age && Objects.equals(name, other.name);
	}
	
   

	

}
