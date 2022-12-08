package lec26_java_coding_challenge;

public class J02_PalindromeWord {

	//TODO Have to discuss with Nasir
	public static boolean isPalindrome(String str) {
		int i = 0, j = str.length() - 1;

		while (i < j) {
			if (str.charAt(i) != str.charAt(j))
				return false;
			i++;
			j--;
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(isPalindrome("RACECAR"));
		System.out.println(isPalindrome("LNTHRUAE"));
		System.out.println(isPalindrome("L"));

	}

}
