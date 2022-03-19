package selfPractice;

public class FindConsonent {

	public static void main(String[] args) {
		consonentFinder("A S D F E k");

	}
	
	public static int consonentFinder(String value) {
		int count=0;
		for(int i=0; i<value.length(); i++) {
			value = value.toLowerCase();
			if(value.charAt(i) != 'a' && value.charAt(i) != 'e' && value.charAt(i) != 'i' && value.charAt(i) != 'o' && value.charAt(i) != 'u' && value.charAt(i) != ' ') {
				count++;
			}
		}
		System.out.println(count);
		return count;
	}

}
