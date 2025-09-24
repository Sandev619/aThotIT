package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo2 {

	public static void main(String[] args) {
		
		Map<Integer,String> hmap1= new HashMap<>();
		hmap1.put(101, "prakash");
		hmap1.put(111, "monas");
		hmap1.put(100, "amans");
		hmap1.put(50, "ram");
		hmap1.put(50, "prakash");
		hmap1.put(55, "psam");
		
		     System.out.println(hmap1);
		     System.out.println(hmap1.get(111));
		  
		 System.out.println(hmap1.containsKey(50));  
		 System.out.println(hmap1.containsKey(599)); 
		 System.out.println(hmap1.containsValue("ram"));
		 System.out.println(hmap1.containsValue("deep"));
		 System.out.println(hmap1.containsValue("amans"));
		 System.out.println(hmap1.containsValue("prakash"));
		 
		 System.out.println(hmap1.size());
		 Set<Integer> setOfkeys=hmap1.keySet();
		 System.out.println(setOfkeys);
		 System.out.println( hmap1.values());
		
		

	}

}
