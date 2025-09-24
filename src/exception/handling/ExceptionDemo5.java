package exception.handling;
     
    //when excwption comes programmes abnormally terminated and does not continue further

public class ExceptionDemo5 {

	public static void main(String[] args) {
		try {

			int no1 = 100;
			int no2 = 0;

			System.out.println(no1 / 2); // 50

			System.out.println(no1 / no2); // exception thrown(ArithmeticException)
			System.out.println("this line can create issue..i do not know");

		} 

		catch (NullPointerException ex) {
			System.out.println("Arithmetic exception handled here");

		} 
		
		finally {
			
			System.out.println("i will execute always..no matter exception hdandled or not");
		}
		
	}

}