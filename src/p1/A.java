package p1;

// Acess modifiers//private>default>protected>public
public class A {

	private int   p=10;   //can bbe accessed only within class
	        int   q=20;   //default//can be accessed only within package
	protected int r=30; //outside package only child class object can access it
	public int    s=40;  //anyone can access within application
	
	

	public static void main(String[] args) {
		A a=new A();
		System.out.println(a.p);
		System.out.println(a.q);
		System.out.println(a.r);
		System.out.println(a.s);
	}

}

