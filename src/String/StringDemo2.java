package String;
   //String is a class in java. All string created are object of the class
   //when we do 

 public class StringDemo2 {

	public static void main(String[] args) {
		// creating string --way 1
		String str1= "sandev";   // most frquently used
		
		System.out.println(str1.length());
		System.out.println("print 1st character");
		System.out.println(str1.charAt(0));
		
		System.out.println("print last character");
		System.out.println(str1.charAt(str1.length()-1));
		
		
		System.out.println("substring==");
		System.out.println(str1.substring(1));// remooving the 1st letter
		System.out.println(str1.substring(2)); //removing the 2nd letter
		
		System.out.println("susbstring== version2");
		
		System.out.println(str1.substring(0,4));
		System.out.println(str1.substring(0,6));
		System.out.println(str1.substring(2,5));
		
		System.out.println("SandevBhimlakhe".substring(6,"SandevBhimlakhe".length()));
		
		System.out.println("SandevBhimlakhe".substring(6,"SandevBhimlakhe".length()-5));
		
		
		
		
		
	}

}
