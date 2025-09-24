package exception.handling;
     
    //when excwption comes programmes abnormally terminated and does not continue further

public class ExceptionDemo3 {

	public static void main(String[] args) {
		try {

			int no1 = 100;
			int no2 = 0;

			System.out.println(no1 / 2); // 50

			System.out.println(no1 / no2); // exception thrown(ArithmeticException)
			System.out.println("this line can create issue..i do not know");

		}

		catch (Exception ex) {
			System.out.println("exception handled here");

		}
		System.out.println("u can do something here if u want");
	}

}