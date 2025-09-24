package methods;

public class MethodDemo1 {

	public static void main(String[] args) { // inbuilt method
		int a = 10;
		int b = 20;
		int result1 = a + b;
		System.out.println(result1);// 30
		int d = 5;
		int e = 30;
		int result2 = d + e;
		System.out.println(result2);// 35
		//calling sum()
		
		sum(10,20);//calling sum method
		System.out.println("after calling sum()");
		sum(5,30);
		System.out.println("end of main");

	}

	// creating method/defining a method

	static void sum(int x, int y) { // user defined method

		int result = x + y;
		System.out.println(result);

	}

}
