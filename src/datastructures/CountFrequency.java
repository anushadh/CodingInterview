package datastructures;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.TreeMap;

public class CountFrequency {
	
	public static void main(String args[]) {
		
		String[] array = {"car", "bike", "car", "cycle", "bus", "bike"};
		
		List<String> list = Arrays.asList(array);
		countFrequency1(list);		
		System.out.println("****************");
		countFrequency2(list);
		System.out.println("****************");
		countFrequency3(list);
		
	}
	
	static void countFrequency1(List<String> list) {
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		for(String s : list) {
			Integer i = hm.get(s);
			hm.put(s, ((i==null) ? 1 : i+1));
		}
		for(Entry<String, Integer> e : hm.entrySet()) {
			System.out.println(e.getKey() + " | " + e.getValue());
		}	
	}
	
	static void countFrequency2(List<String> list) {
		HashSet<String> hs = new HashSet<>(list);
		for(String s : hs) {
			System.out.println(s + " | " + Collections.frequency(list, s));
		}
	}
	
	static void countFrequency3(List<String> list) {
		TreeMap<String, Integer> tm = new TreeMap<>();
		for(String s : list) {
			Integer i = tm.get(s);
			tm.put(s, ((i==null) ? 1 : i+1));
		}
		for(Entry<String, Integer> e : tm.entrySet()) {
			System.out.println(e.getKey() + " | " + e.getValue());
		}
	}
}
