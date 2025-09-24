package arrays;

public class LargestElement {
	public static void main(String[] args) {
		
		int[] numbers= {10,2,30,40,5,89,99};
		
		int largest=numbers[0];//10

				
		for(int i=1;i<=numbers.length-1;i++) {
			
			
			if(largest<numbers[i]) {
			 
			}
				largest=numbers[i];
				
				
			
			
		}
		
		System.out.println("lasrgest value is "+largest);
		
		
	}
}

