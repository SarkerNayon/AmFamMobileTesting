package selfPractice;

import java.util.Scanner;

public class TryCtachEx {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("what is your fev number");
			try {
				int n = sc.nextInt();
				System.out.println("your entered :- " + n);
			} catch (Exception e) {
				System.out.println("your didn't entered a Number");
			}
		}

	}

}
