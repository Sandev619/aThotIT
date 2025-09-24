package array.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo7 {

	public static void main(String[] args) {
		
		List<Integer>aalist1=new ArrayList<>();
		  aalist1.add(200); 
		  aalist1.add(300);
		  aalist1.add(100);
		  System.out.println(aalist1);
		  
		  
		  //iteration using for each loop
		  // elements multiplication
		     for (Integer element :aalist1) {
		    	 
			   System.out.println(3*element);  
		  }
		     
		   System.out.println("iteration using for loop");  
		   for (int i=0; i<aalist1.size();i++) {
			   
			   System.out.println(aalist1.get(i));
		   }   
	
		   System.out.println("iteration using iterator");
		   
		   Iterator<Integer> itr =aalist1.iterator();
		   while (itr.hasNext()){
			   
		   
		   System.out.println(itr.next());
		   
	       }
	}
}