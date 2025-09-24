package inheritance;
    // inheritence contains  Is a relationship
      //method Overriding >>modifying existing method of parents class

public class Dog extends Animal{
	//specific method of dog class
	
	void bark () {
		
		System.out.println("barking");
	}
     
		// method Overriding >> modifying existing method of parents class
	
	void run() {
		
		System.out.println("running at 200 m/hrs");

	}

}
