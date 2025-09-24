package String;

public class ReverseOpeator { // reverse

	public static void main(String[] args) {
		
		String strr = "computer ";
		String reve ="";
		
		int len = strr.length();
		
		 for (int i=len-1;i>=0;i--)
		 {
			 reve=reve+strr.charAt(i);
		 }
		 System.out.println("reverse string is :"+ reve);

	}
	}

