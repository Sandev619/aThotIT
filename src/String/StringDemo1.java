package String;
   //String is a class in java. All string created are object of the class
   //when we do 

 public class StringDemo1 {

	public static void main(String[] args) {
		// creating string --way 1
		String str1= "sandev";   // most frquently used
		
		//creating string -- way 2 (using new keyword)
		String str2 =new String ("sandev");
		
		String str3 =2+3+ " sandev";
		System.out.println(str3);
		System.out.println(2+3+" sandev"+2);
		System.out.println(2+3+" sandev"+2+3);
		System.out.println("2"+3+"sandev"+2+3); 

	}

}
