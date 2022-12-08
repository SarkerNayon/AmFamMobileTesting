package lec25_java_coding_challenge;

import java.util.HashSet;
import java.util.Set;

public class E02_findStringWhichPresentMoreThanOne { // who are duplicated?
	public static void main(String[] args) {
		// Here language is an String type Array.
		String[] language = { "Java", "C++", "C#", "Python", "Java", "C++", "Java", "Python", "Javascript", "C++" };
		
		Set <String> notMoreThanOne = new HashSet<>();
		
		for (int i =0; i<language.length; i++) { // 
			
			for(int j = i+1; j<language.length; j++) {
				
				if (language[i].equals(language[j])) {
					
					notMoreThanOne.add(language[i]); // add() is the method of set, which add valu and store in memory
				
				}
			}
		}
		System.out.println(notMoreThanOne);
		
		
		
	}
}
