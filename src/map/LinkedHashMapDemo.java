package map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
//LinkedHashMap is an ordered map ie its maintain the insertion order
public class LinkedHashMapDemo {

	public static void main(String[] args) {
		
		//HashMap<Integer,String> hmap1 = new HashMap<>(); //Empty HashMap
		
		Map<Integer,String> lmap1 = new LinkedHashMap<>(); //better
		lmap1.put(101, "prakash");
		lmap1.put(111, "mohan");
		lmap1.put(100, "deepak");
		lmap1.put(50, "aman");
		
		System.out.println("iteration using Map.Entry");
		Set<Entry<Integer ,String>> setOfEntry=lmap1.entrySet();
		
		for(  Entry<Integer ,String> entry : setOfEntry) {
			
			System.out.println(entry.getKey() +" "+ entry.getValue());
		}
		
		
		
		System.out.println(" using keySet() for iteration over keys");
        for (Integer i : lmap1.keySet()) {
        	
        	System.out.println( i+"  "+lmap1.get(i));
        	
        }
            
        
       
    }
		
		
		
	}

