package StringBuilder.Buffer;

public class StringBuilderDemo1 {

	public static void main(String[] args) {

       StringBuilder sb1 = new StringBuilder ("Hello ");
       System.out.println(sb1.append("world"));
       System.out.println(sb1);
       
         /// StringBuilder sb2 ="hellowmiss";// not allowed, must use NEW keyword
       
       sb1.delete(0, 3);
       System.out.println(sb1);
       
       sb1.insert( 0, "nepal");
       System.out.println(sb1);
       
       sb1.delete(5, 7);
       System.out.println(sb1);
       
       sb1.reverse();
       System.out.println(sb1);
       
       // method chaining // all method done in one line
       
       StringBuilder sb2 = new StringBuilder ("Hello ");
       System.out.println(sb2.append("world").delete(0, 3).insert(0, "nepal").delete(5, 7).reverse());
       
       
       

	}

}
