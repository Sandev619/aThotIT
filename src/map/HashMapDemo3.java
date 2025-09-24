package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo3 {

	public static void main(String[] args) {
		
		Map<Integer,String> hmap1= new HashMap<>();
		hmap1.put(101,  "prakash");
		hmap1.put(111,  "monas");
		hmap1.put(100,  "amans");
		hmap1.put(50,   "ram");
		hmap1.put(50,   "prakash"); 
		hmap1.put(55,   "psam");
		
		
		System.out.println("Iteration using Map.Entry  \n");
		Set<Entry<Integer,String>>setOfEntry =hmap1.entrySet();
		
		for ( Entry<Integer,String>  entry    :setOfEntry)  {
			
			System.out.println(entry.getKey()+ " "+ entry.getValue());
		}
		
	

	}

}
