package day1;

public class Operators {

	//+,-,*,/, %(modulo operator),++,--,>,< ,==(for comparison),=(assignment)
	//&&, ||
	public static void main(String[] args) {
		
		int numberOne =10;
		int numberTwo=20;
		int numberTthree=22;
		int numberFour=10;
		
		System.out.println(numberOne/numberTwo);
		
		System.out.println(numberTwo/numberOne);
		
		System.out.println(numberOne%numberTwo);//10
		
		System.out.println(numberTthree%numberOne);//2
		
		System.out.println(numberOne == numberTwo);//false
		System.out.println(numberOne == numberFour);//true
		
		System.out.println(numberOne < numberFour);//false
		System.out.println(numberOne <= numberFour);//true
		

	}

}
