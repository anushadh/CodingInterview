package arraysAndStrings;

public class Problem8 {
	
	public static void main(String args[]) {
		
		String str1 = "apple";
		String str2 = "ppale";
		
		boolean isRotation = isRotation(str1, str2);		
		System.out.println(isRotation);
		
	}

	private static boolean isRotation(String str1, String str2) {
		
		if(str1.length() > 0 && (str1.length() == str2.length())) {
			String str11 = str1 + str1;
			if(isSubString(str11, str2)) {
				return true;
			}
		} 
		return false;
	}

	private static boolean isSubString(String str1, String str2) {
		
		if(str1.contains(str2)) {
			return true;
		}
		return false;
	}
	
}
