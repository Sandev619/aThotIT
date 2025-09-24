package String;

public class StringDemo4 {

	public static void main(String[] args) {
		
		String s1 ="spring java hibernate";
		String []arrOfStrings =s1.split(" ");
		
		for(String str : arrOfStrings) {
			
			System.out.println(str);
		}
		String s2 ="spri@java@hibernate";
		String[]arrOfStrings2 = s1.split("@");
		
		for (String str : arrOfStrings2){
			
		   System.out.println(str);
		
		}
		System.out.println(s1.contains("spring"));
		System.out.println(s1.contains("son"));
		boolean found=s1.contains("java");


	}

}
