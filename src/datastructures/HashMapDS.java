package datastructures;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

/*It is a map based collection with key value pairs.
It is not ordered. It is not sychronized and allows null keys and values. 
*/
public class HashMapDS {
	
	public static void main(String args[]) {
		HashMap<Integer, String> hm = new HashMap<>();
		hm.put(1, "Ajith");
		hm.put(2, "Ajay");
		hm.put(3, "Anuj");
		
		for (Entry<Integer, String> e : hm.entrySet()) {
			System.out.println(e.getKey() + " : " + e.getValue());
		}
		
		System.out.println("***************");
		
		Set<Entry<Integer,String>> set = hm.entrySet();
		Iterator it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	
	}
	
}
