package methods;

public class MethodDemo3 {

	public static void main(String[] args) {
	    sum(20,40);
		multiply(3,7,2);
	   	printHello();
					

			}
			
	   		static void sum(int x, int y) { // user defined method

				int result = x + y;
				System.out.println(result);
				
				multiply(6,8);
			}
			
			static void multiply(int x, int y) { // user defined method

				int result = x * y;
				System.out.println(result);
			}
			//method overloading(same name but different parameters)
			static void multiply(int x, int y,int z) { // user defined method

				int result = x * y*z;
				System.out.println(result);
			}
			
			
			static void printHello() { //zero parameter

				
				System.out.println("Helloooooooooooooooo");
			}
			
			
			
			
			

		}