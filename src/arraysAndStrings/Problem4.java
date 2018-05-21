package arraysAndStrings;

import java.util.Arrays;

public class Problem4 {
	
	public static void main(String args[]) {
		
		String str1 = "spar";
		String str2 = "rasp";
		
		char[] chr1 = str1.toCharArray();
		char[] chr2 = str2.toCharArray();
		
		Arrays.sort(chr1);
		Arrays.sort(chr2);
		System.out.println(isAnagram(chr1, chr2));
		
	}

	private static boolean isAnagram(char[] chr1, char[] chr2) {
		
		if(Arrays.equals(chr1, chr2)) {
			return true;
		} else {
			return false;
		}
		
		/*if(chr1.length != chr2.length) {
			return false;
		}
		for(int i = 0; i < chr1.length; i++) {
			if(chr1[i] != chr2[i]) {
				return false;
			}
		}
		return true;*/
	}

}
