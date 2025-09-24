package polymorphism;

public class Laptop {
	
	void screen() {
		System.out.println("Screen size is 15' long");
	}
   
public static void main (String[] args) {
		Laptop lap =new Laptop ();
		lap.screen();
		
		lap =new HpLaptop();
		lap.screen();
		
		lap =new Apple();
		lap.screen();
	}

}

     class HpLaptop extends Laptop {
	 void screen() {
		 System.out.println("Screen size is 17' long");
	 }
	 
     }
	 class Apple extends Laptop {
	 void screen () {
		 System.out.println("Screen size is 13' long");
	 }
		 
	 }
	 
 

