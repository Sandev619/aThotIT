package array.list;
// Arraylist is a inbuilt class
import java.util.ArrayList;
// <> is known as generics used for type safety
public class ArrayListDemo1 {

	public static void main(String[] args) {
		
		ArrayList aalist1 =new ArrayList();
		System.out.println(aalist1);
		aalist1.add(10);
		aalist1.add(20);
		aalist1.add(30);
		aalist1.add(15);
		System.out.println(aalist1);
		
		
		ArrayList aalist2 =new ArrayList();
		System.out.println(aalist2);
		aalist2.add("sandev");
		aalist2.add("sun");
		aalist2.add("moon");
		aalist2.add("200"); // not as desire coz integer comer in string group
		System.out.println(aalist2);
		
		//creating a lsit which store only string
		ArrayList<String >aalist3 =new ArrayList<>();
		aalist3.add("sand");
		aalist3.add("water");
		aalist3.add("moon");
		  //aalist3.add(200); error coz it only sotre string..aray list with string are focus here
		System.out.println(aalist3);
	}

}
