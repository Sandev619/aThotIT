package map;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo1 {

	public static void main(String[] args) {
		
		//HashMap<Integer,String>hmap1 = new HashMap<>(); // empty Hashmap
		
		Map<Integer,String>hmap1= new HashMap<>();
		hmap1.put(101, "prakash");
		hmap1.put(111, "mona");
		hmap1.put(100, "ram");
		hmap1.put(50, "aman");
		hmap1.put(50, "prakash");
		     System.out.println(hmap1);
		     
		     System.out.println("-------");
		
		
		Map<String,String>hmap2= new HashMap<>();
		hmap2.put("101", "prakash");
		hmap2.put("111", "mona");
		hmap2.put("100", "ram");
		hmap2.put("50", "aman");
		hmap2.put("50", "prakash");
	            System.out.println(hmap2);


	}

}
