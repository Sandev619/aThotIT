package day1;

public class Operators2 {

public static void main(String[] args) {
		
		boolean a = true;
        boolean b = false;
        int x=50;
        int age = 25;
        boolean hasID = true;
        
        
        System.out.println("a && b = " + (a && b));
		
		 System.out.println("a || b = " + (a || b));  // Output: true
    
		 System.out.println("!a = " + (!a));  // Output: false
		 
		// System.out.println("!a = " + (!x));//error
		 
		 System.out.println(age >= 18 && hasID); //true
		 
	}

}
