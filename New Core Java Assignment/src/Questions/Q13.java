package Questions;

public class Q13 {

	public static void PrintTriangle(int size) {
		
		int characterIteration = 0;
		
		for (int row = 0; row < size; ++row) {
			
			for (int column = 0; column < row + 1; ++column) {
				System.out.print( (characterIteration % 2) + " ");
				++characterIteration;
			}
			
			System.out.println();
		}
	}
}
