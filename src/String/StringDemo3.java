package String;

public class StringDemo3 {

	public static void main(String[] args) {
	 
		String s1 = "sandev";
		
		s1 = s1+ " nepal";
		
		s1= s1+" 2025"; // after this statement earlier objects are pointed by s1 ...
		                // ...are eligible for garbage collection
		
		System.out.println(s1);
			

	}

}
