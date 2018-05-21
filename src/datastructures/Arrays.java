package datastructures;
//Array Implementation
public class Arrays{
	
	private static int[] array = new int[20];
	private static int arraySize = 10;
	
	public static void main(String args[]) {
		Arrays obj = new Arrays();
		obj.generateRandomArray();
		obj.printArray();
		System.out.println("Value at index 5: " + obj.getValueAtIndex(5));
		System.out.println("Array contains value 15: " + obj.containsValue(15));
		obj.deleteValue(6);
		obj.printArray();
		obj.insertValue(9);
		obj.printArray();
		obj.searchValue(12);
	}
	
	void generateRandomArray() {
		for(int i = 0; i < arraySize; i++) {
			array[i] = (int) (Math.random()*10) + 10;
		}
	}
	
	void printArray() {
		for(int i = 0; i < arraySize; i++) {
			System.out.println( i + " | " + array[i]);
		}
	}
	
	int getValueAtIndex(int index) {
		if(index < arraySize) {
			return array[index];
		}
		return 00;
	}
	
	boolean containsValue(int value) {
		for(int i = 0; i < arraySize; i++) {
			if(array[i] == value) {
				return true;
			}
		}
		return false;
	}
	
	void deleteValue(int index) {
		if(index < arraySize) {
			for(int i = index; i < arraySize; i++) {
				array[i] = array[i+1];
			}
		}
		arraySize--;
	}
	
	void insertValue(int value) {
		if(arraySize < 50) {
			array[arraySize] = value;
		}
		arraySize++;
	}
	
	void searchValue(int value) {
		System.out.print(value + " found at indexes: ");
		for(int i = 0; i < arraySize; i++) {
			if(array[i] == value) {
				System.out.print(i + " ");
			}
		}
	}
}