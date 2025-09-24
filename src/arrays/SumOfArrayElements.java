package arrays;

public class SumOfArrayElements {

	public static void main(String[] args) {
		
		int[] numbers= {10,20,30,40};
		
		int sum=0;//10,30
		
		for( int num:numbers) {
		
		sum=sum +num;//sum=0+10=10,sum=10+20=30,sum=30+30=60,sum=60+40
		
		

	}
		
		System.out.println("the sum of array elemnts is "+sum);

	}

}
