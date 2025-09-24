package array.list;


import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo1 {
	

	public static void main(String[] args) {
		
		
		
		List<Integer>aalist1 =new LinkedList<>();  //way2..better
		 
		  aalist1.add(200); // error as array list now will allow String
		  aalist1.add(300);
		  aalist1.add(100);
		  System.out.println(aalist1);
	}

}
