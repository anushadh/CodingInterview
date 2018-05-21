package arraysAndStrings;

public class Problem3 {
	
	public static void main(String args[]) {
		
		String str = "";
		//str =  str.toLowerCase();
		StringBuilder newString = new StringBuilder();
		
		boolean[] chars = new boolean[256];
		for(int i = 0; i < str.length(); i++) {
			int value = str.charAt(i);
			if(chars[value]) {
				newString.append("");
			} else {
				newString.append(str.charAt(i));
				chars[value] = true;
			}
		}
		
		System.out.println(newString.toString());
	}
	
	//TestCases
	//1. Empty String
	//2. String with no duplicates
	//3. String with duplicates
	//4. null
}
