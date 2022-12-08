package lec25_java_coding_challenge;

import java.util.Arrays;

/*

Interview question in comcast (PA)F
Write a function to transform input, e.g.:
Input: "Hello Mohammad Tofael Kabir Sharkar"
Output: "Sharkar Kabir Tofael Mohammad Hello"

*/

public class B05__reverseTheWordsFromParagraph {

	public static void main(String[] args) {
		String name = "Hello Mohammad Tofael Kabir Sharkar";
		String[] words = name.split(" ");
		// System.out.println(Arrays.toString(words));
		// I did above line just to show that the sentence is split to a List
		
		for(int i = words.length-1; i >=0; i-- ) {
			System.out.println(words[i]+" ");
			// Why print not println?
			// why we use " " ?
		}

	}

}
