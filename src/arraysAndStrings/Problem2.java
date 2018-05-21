package arraysAndStrings;

public class Problem2 {
	
	public static void main(String args[]) {
		
		String str = "anusha";
		int size = str.length();
		StringBuilder cString = new StringBuilder("\0");
		
		for(int i = size-1; i >= 0; i--) {
			cString.append(str.charAt(i));
		}
		
		System.out.println("C String: " + cString);
	}

}
