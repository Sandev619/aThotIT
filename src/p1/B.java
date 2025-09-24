package p1;

public class B {

	
	

	public static void main(String[] args) {
		A a=new A();
		//System.out.println(a.p);//error as p is private which can not be accessed from outside the class
		System.out.println(a.q);
		System.out.println(a.r);
		System.out.println(a.s);

	}

}