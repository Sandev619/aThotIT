package arrays;

public class ArrayDemo2 {

	//print using for each loop
		public static void main(String[] args) {

			// way1
			int[] arr1 = new int[4];
			arr1[0] = 10;
			arr1[1] = 20;
			arr1[2] = 30;
			arr1[3] = 40;
			// way2
			int[] arr2 = { 1, 2, 3, 4 };

			// print all elements of arr1 using for each loop

			for (int num : arr1) {
				System.out.println(num);

			}

			// print all elements of arr2 using for each loop

			for (int num : arr2) {
				System.out.println(num);

			}
			
			System.out.println("print doule of all elements of arr2 using for each loop");

					for (int num : arr2) {
						System.out.println(num*2);

					}

	}

}
