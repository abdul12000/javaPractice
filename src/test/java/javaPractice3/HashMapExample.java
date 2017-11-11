package javaPractice3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.testng.annotations.Test;
/*
 * Map
 * A Map is an object that maps keys to values. A map cannot contain duplicate keys.
 * Below are the main implementations of Map Interfaces
 * - HashMap
 * - TreeMap
 * - LinkedHashMap
 */
public class HashMapExample {
	
	HashMap<Integer, String> hm = new HashMap<Integer, String>();
	
	
	
	@Test
	public void runHasMap(){
		hm.put(0, "Hello");
		hm.put(1, "Goodbye");
		hm.put(2, "Morning");
		hm.put(3, "Afternoon");
		hm.put(4, "Night");
		hm.put(6, "");// Hasmap allows for null values
		hm.put(null, "Testing null key with this value");// Hasmap allows for null keys
		
		System.out.println(hm.get(3));
		System.out.println(hm.replace(1, "GoodMorning"));
		hm.remove(3);
		System.out.println(hm);
		
		//Setting index for the values and separating the keys and values
		Set sn = hm.entrySet();
		Iterator it = sn.iterator();
		
		while (it.hasNext()){
			Map.Entry mp = (Map.Entry)it.next();
			System.out.println(mp.getKey());
			System.out.println(mp.getValue());
		
		}

		
	}

}
