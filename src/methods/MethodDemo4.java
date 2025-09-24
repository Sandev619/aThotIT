package methods;

public class MethodDemo4 {
	public static void main(String[] args) {
		int collectedSum = sum(25, 40);

		System.out.println(collectedSum);
		
		boolean isEven=checkEven(collectedSum);
		System.out.println(isEven);

	}

	static int sum(int x, int y) { // user defined method

		int result = x + y;
		return result;
	}
	
	static boolean checkEven(int no) {
		
		if (no % 2== 0) {
			return true;
		
		}else{
			return false;
		}
	}

}
