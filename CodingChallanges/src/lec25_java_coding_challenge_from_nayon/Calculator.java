package lec25_java_coding_challenge_from_nayon;

public class Calculator {

	int num = 100;

	// There is no sysout inside this method
	// global variable got a new value from here
	public void cal(int num) {
		this.num = num * 10;
	}

	public void printNum() {
		System.out.println(num);
	}

	public static void main(String[] args) {
		Calculator obj = new Calculator();
		obj.cal(2);
		obj.printNum();
	}

}
