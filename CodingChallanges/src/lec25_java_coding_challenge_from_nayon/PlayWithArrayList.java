package lec25_java_coding_challenge_from_nayon;

// Will explain when ArrayList will be teaches

import java.util.ArrayList;
import java.util.List;

public class PlayWithArrayList {
	public static void main(String[] args) {
		final List<String> list = new ArrayList<>(1);
		list.add("1");
		list.add("2");
		list.add("3");
		list.remove(2);
		System.out.println(list);

	}
	
	//1,3 -sanji,
	//1,2- saleem, shobeb, anik

}
