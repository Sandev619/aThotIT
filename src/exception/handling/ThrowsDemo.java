package exception.handling;

import java.util.Scanner;

public class ThrowsDemo {

	public static void main(String[] args) {

		System.out.println("Enter the guest name");
		Scanner input = new Scanner(System.in);
		String enterName = input.next();

		try {
			if (enterName.equals("prakash")) {
				Exception exception = new Exception("sorry prakash not allowed");
				throw exception;
			}
		}
		
	
		catch (Exception f) {
			
			
			 System.out.println(f.getMessage());
			 return;
		}
		System.out.println("welcome" +enterName);
		System.out.println("thanks");

	}

}


