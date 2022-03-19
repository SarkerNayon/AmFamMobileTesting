package selfPractice;

public class FindVowels {

	public static void main(String[] args) {
		vowelFinder("A boy is playing");

	}
	
	public static int vowelFinder(String value) {
		int count=0;
		for(int i=0; i<value.length(); i++) {
			value.toLowerCase();
			if(value.charAt(i) == 'a' || value.charAt(i) == 'e' ||value.charAt(i) == 'i' ||value.charAt(i) == 'o' ||value.charAt(i) == 'u') {
				count++;
			}
		}
		System.out.println(count);
		return count;
	}

}
