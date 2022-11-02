public class AccuracyExample {
	public static void main(String[] args) {
		int apple = 1;
		double pieceUnit = 0.1;
		int number = 7;
		
		// ? = 1 - 7 * 0.1
		double result = apple - number * pieceUnit;
		
		System.out.println(result);
		
// ********************************************************
		
		int apple1 = 1;
		int totalPieces = apple1 * 10;
		int number1 = 7;
		
		int temp = totalPieces - number;
		double result1 = temp / 10.0;
		
		System.out.println(result1);
	}

}


