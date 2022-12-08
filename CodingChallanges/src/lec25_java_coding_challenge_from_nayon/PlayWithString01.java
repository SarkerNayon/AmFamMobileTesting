package lec25_java_coding_challenge_from_nayon;

public class PlayWithString01 {

	public static void main(String args[]) {
		String s1 = new String("Test");
		String s2 = new String("Test");

		System.out.print("Results: ");
		if (s1 == s2)
			System.out.print("Same");
		if (s1.equals(s2))
			System.out.print("Equals");
	}

}
