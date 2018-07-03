package arraysAndStrings;

public class Problem9 {
	
	public static String str = "AAABBBBCCDDD";
	//Give output like A3B4C2D3
	public static void main(String args[]) {
		
		int length = str.length();
		StringBuilder str2 = new StringBuilder();
		boolean end = false;
		for(int i = 0; i < length; i++) {		
			char tmp = str.charAt(i);
			int count = 1;
			str2 = str2.append(tmp);
			for(int j = i+1; j < length; j++) {
				if(tmp == str.charAt(j)) {
					count++;
					if(j == length-1) {
						end = true;
					}
				} else {
					i = j-1;
					break;
				}
			}
			str2 = str2.append(count);
			if(end) {
				break;
			}
		}
		System.out.println(str2.toString());
	}
}
