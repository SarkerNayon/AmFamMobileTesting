package lec25_java_coding_challenge;

public class H03_swapInteger {

	public static void main(String[] args) {
		int x = 10;
		int y = 5;

		// using operator
		x = x * y;
		y = x / y;
		x = x / y;

		System.out.println("The valus of x is: " + x);
		System.out.println("The valus of y is: " + y);

	}

}
