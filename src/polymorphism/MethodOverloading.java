package polymorphism;

//one name many form
//2kinds>>compile time polymorphism(method overloading),run time polymorphim(method overriding)
//method overloading==always happens within same class, same method name with different parameters

public class MethodOverloading {
	
	
	void add (int no1,int no2) {
		System.out.println(no1+no2);
	}
	
	
	void subtract (int no1,int no2)	{
		System.out.println(no1-no2);	
	}
	 void add(int no1, int no2,int no3) {
			
			System.out.println(no1+no2+no3); }
	 
	 void subtract(int no1, int no2,int no3) {
			System.out.println(no1-no2-no3);
			
		}
	 void add(String no1, String no2,String no3) {
		    System.out.println(no1+no2+no3);
	
	}
}

