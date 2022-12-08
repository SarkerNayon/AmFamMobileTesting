package lec26_java_coding_challenge;

// Armstrong number is a number that is equal to the sum of cubes of its digits. 
// For example 0, 1, 153, 370, 371 and 407 are the Armstrong numbers.
// 153 = (1X1X1)+(5X5X5)+(3X3X3)= 153

public class J03_armstrongNumber {

	public static void isArmstrongNumber(int num) {
		System.out.println("The " + num + " is Armstrong Number ?");
		int cube = 0;
		int r; // Remainder
		int t; // total
		
		t = num;
		
		while (num > 0) {
			r = num % 10;
			num = num / 10;
			cube = cube + (r * r * r);
		}
		
		if (t == cube) {
			System.out.println("This is Armstrong Number");
		} else {
			System.out.println("This is not Armstrong Number");
		}
	}

	public static void main(String[] args) {
		isArmstrongNumber(123); // no
		isArmstrongNumber(153); // yes
		isArmstrongNumber(407); // yes

	}

}
