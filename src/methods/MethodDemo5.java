package methods;
//static methods can call other static methods directly

//But to call a non static method we need to call it with the help of object of the class

public class MethodDemo5 {

	public static void main(String[] args) {
		int collectedSum = sum(20, 40);//calling static method

		System.out.println(collectedSum);
		
		//boolean isEven=checkEven(collectedSum);//error
		//create object of MethodDemo5 class as checkEven()belongs to MethodDemo5
		
		MethodDemo5 obj =new  MethodDemo5();
		//now we can call the method with the help of this object
		boolean isEven=obj.checkEven(collectedSum);//calling non static method
		
		System.out.println(isEven);

	}

	static int sum(int x, int y) { // static method

		int result = x + y;
		return result;

	}

	 boolean checkEven(int no) {//non static method

		if (no % 2 == 0) {
			return true;
		} else {
			return false;
		}

	}
}