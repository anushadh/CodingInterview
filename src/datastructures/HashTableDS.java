package datastructures;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

/*Hashtable stores key-value pairs and takes non-null values
It is synchronized.
The key is hashed and the resulting hashcode is used as an index for the key 
in the hashtable.
Key objects must implement hashcode and equals method.
*/

public class HashTableDS {

	public static void main(String[] args) {
		
		Hashtable<Integer, String> ht = new Hashtable<>();
		
		ht.put(1, "Apple");
		ht.put(2, "Orange");
		ht.put(3, "Banana");
		
		System.out.println("Values in the hashtable 1:: " + ht.values());
		
		System.out.print("Values in the hashtable 2:: ");
		Enumeration<String> e2 = ht.elements();
		while(e2.hasMoreElements()) {
			System.out.print(e2.nextElement() + " ");
		}
		System.out.println();
		
		Set s = ht.entrySet();
		System.out.println("Values in the hashtable 3:: " + s);
		
		String[] colors = new String[] {"Red", "Black", "white"};
		Hashtable<Integer, String> ht2 = new Hashtable<>();
		int i = 1;
		for(String color : colors) {
			ht2.put(i, color);
			i++;
		}
		System.out.println("***Colors***");
		Enumeration<String> col = ht2.elements();
		while(col.hasMoreElements()) {
			System.out.println(col.nextElement());
		}
		
	}
	
}


