package lec25_java_coding_challenge;

public class H04_swapInteger {

	public static void main(String[] args) {
		int x = 11;
		int y = 50;

		// using ^ operator (also called caret or xor symbol)
		x = x ^ y;
		y = x ^ y;
		x = x ^ y;

		System.out.println("The valus of x is: " + x);
		System.out.println("The valus of y is: " + y);

	}

}
