package lec26_java_coding_challenge;

import java.util.Arrays;

/*
 Q7:- Print the string in sorting order.
		s = "yakbz5o27leux4wRq9LAc3KMBm80";
 */

public class I01_SortTheString {

	public static void main(String[] args) {
		// Custom string input
		String s = "yakbz5o27leux4wRq9LAc3KMBm80";
		// Converting string into an array of character
		char[] arr = s.toCharArray();

		// System.out.println(Arrays.toString(arr));
		// outcome: [y, a, k, b, z, 5, o, 2, 7, l, e, u, x, 4, w, R, q, 9, L, A, c, 3, K, M, B, m, 8, 0]
		char temp;
		// Nested for loop used for comparison of characters in above character array
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[i]) {
					// Comparing the characters one by one by the help of temp character variable
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}

			}

		}
		// By now loop is done means we have iterated the whole array
		System.out.println(arr);

	}

}
