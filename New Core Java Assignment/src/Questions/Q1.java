package Questions;

import java.util.Arrays;

public class Q1 {

	
	public static int[] BubbleSort(int[] array) {

		boolean sorted;
		do {
			sorted = true;
			for (int i = 0; i < array.length - 1; ++i) {
				if (!sorted(array[i], array[i+1])) {
					swap(array, i, i+1);
					sorted = false;
				}
			}
		} while (!sorted);

		return array;
	}

		static boolean sorted(int element, int rightNeighbor) {
		return element < rightNeighbor;
	}

		static void swap(int[] array, int element_a, int element_b) {
		int temp = array[element_a];
		array[element_a] = array[element_b];
		array[element_b] = temp;
	}
}