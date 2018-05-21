package arraysAndStrings;

public class Problem5 {
	
	public static void main(String args[]) {
		
		String str = "a bc   ";
		
		//str = str.replaceAll(" ", "%20");
		
		System.out.println(str);
		
		char[] chr = str.toCharArray();
		StringBuilder newString = new StringBuilder();
		for(char chrs : chr) {
			if(chrs == ' ') {
				newString.append("%20");
			} else {
				newString.append(chrs);
			}
		}
		
		System.out.println(newString.toString());
	}

}
