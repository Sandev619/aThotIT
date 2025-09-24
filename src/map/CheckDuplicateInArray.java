package map;

import java.util.HashSet;
import java.util.Set;

public class CheckDuplicateInArray {

	public static void main(String[] args) {
		
		int[] arr = {1,3,2,5,4,1,3,3,3};
	
		Set<Integer> hset =new HashSet<>();
		boolean duplicate = false;
		 for (int nums : arr) {
			 

				boolean isAdded = hset.add(nums);
				if(isAdded == false) {
					System.out.println(" array contains duplicate");
					break;
				}
				
			 
		 }

	}

}
