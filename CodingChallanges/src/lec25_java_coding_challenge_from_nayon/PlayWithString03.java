package lec25_java_coding_challenge_from_nayon;

public class PlayWithString03 {

	public static void main(String[] args) {
		String s = "Java Java";
		s.replace('a', '@');
		// System.out.println(s.replace('a', '@'));
		// System.out.println(s.replaceAll(s, "Showkot wanna know"));
		// Main clue: String is immutable
		System.out.print(s);
	}
}
