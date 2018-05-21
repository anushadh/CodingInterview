package arraysAndStrings;

public class Problem7 {
	
	public static void main(String args[]) {
		
		int[][] matrix = {{1,2,0}, {3,4,9},{4,5,6}};
		int[] rows = new int[matrix.length];
		int[] columns = new int[matrix[0].length];
		
		for(int i = 0; i < rows.length; i++) {
			for(int j = 0; j < columns.length; j++) {
				if(matrix[i][j] == 0) {
					rows[i] = 1;
					columns[j] = 1;
				}
			}
		}
		
		for(int i = 0; i < rows.length; i++) {
			for(int j = 0; j < columns.length; j++) {
				if(rows[i] == 1 || columns[j] == 1) {
					matrix[i][j] = 0;
				}
				System.out.print(matrix[i][j]);
			}
			System.out.println("");
		}
		
		
		
	}
	
}
