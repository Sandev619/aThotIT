package StringBuilder.Buffer;

public class Reverse {

	public static void main(String[] args) {
		String str = "Hellow world";
		String reversed = new StringBuilder(str).reverse().toString();
		System.out.println("Reversed String: "+ reversed);
		

	}

}
