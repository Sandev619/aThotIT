package array.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo3 {

	public static void main(String[] args) {
		
		
		
		List<Integer>aalist1 =new ArrayList<>();
		
		  aalist1.add(200); // 
		  aalist1.add(300);
		  aalist1.add(100);
		  aalist1.add(50);
		  System.out.println(aalist1);
		  System.out.println(aalist1.get(0)); //200
		  System.out.println(aalist1.get(3)); //50
		  System.out.println(aalist1.size()); //total 4 as seen
		  
		  //removing
		  aalist1.remove(2);
		  System.out.println(aalist1);
		  //searching object  contained or not
		  System.out.println(aalist1.contains(100)); //false
		  System.out.println(aalist1.contains(50)); //true
		  
		  //sorting now
		  Collections.sort(aalist1);
		  System.out.println(aalist1); //50 ,200 ,300
		  
		  //reversing
		  Collections.reverse(aalist1);
		  System.out.println(aalist1);
		  
		

	}

}
