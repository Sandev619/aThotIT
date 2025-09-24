package arrays;

public class ArrayDemo1 {
public static void main(String[] args) {
		
		//way1
		int[] arr1=new int[4];
		arr1[0]=10;
		arr1[1]=20;
		arr1[2]=30;
		arr1[3]=40;
		//way2
		int[] arr2= {1,2,3,4};
		
		//print all elements of array using for loop
		
		for(int i=0;i<=3;i++) {
			System.out.println(arr1[i]);//arr1[0],arra1[1]..
			
			
		}
		
		System.out.println("print all elements of array2 using for loop");
		
		for(int i=0;i<=arr2.length-1;i++) {
			System.out.println(arr2[i]);//arr1[0],arra1[1]..
			
			
		}
		
		System.out.println("print all elements of array2 using for loop");
		
		for(int i=0;i<arr2.length;i++) {
			System.out.println(arr2[i]);//arr1[0],arra1[1]..
			
			
		}
	}

}
