package arraysAndStrings;

import java.util.Arrays;

public class Problem1 {
	
	public static void main(String args[]) {
		String str = "Anushf";
		str = str.toLowerCase();
		int size = str.length();
		
		//Solution 1 
		/*for(int i = 0; i < size; i++) {
			for(int j = i+1; j < size; j++) {
				if(str.charAt(i) == str.charAt(j)) {					
					System.out.println("String doesn't have unique characters");
					break;
				}
			}
		}*/
		
		//Solution 2
		/*//char[] array = new char[size];
		char[] array = str.toCharArray();
		Arrays.sort(array);
		System.out.println(array);
		for(int i = 0; i < size-1; i++) {
			if(array[i] == array[i+1]) {
				System.out.println("String doesn't have unique characters");
				break;
			}
		}*/
		
		
		//Solution 3
		boolean[] chars = new boolean[256]; //ASCI chars
		for(int i = 0; i < size; i++) {
			int charValue = str.charAt(i);
			if(chars[charValue]) {
				System.out.println("String not unique");
				break;
			} else {
				chars[charValue] = true;
			}
		}
	}
}
