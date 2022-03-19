package selfPractice;

public class ArmStrongNum{
	// armstrongNum number:
	public static void main(String[]args) {
		armstrongNum(371);
	}
	public static int armstrongNum(int num) {
		int r=0;
		int actual=0;
		int reserve=num;
		
		while(num>0) {
			r=num%10;
			num=num/10;
			actual=actual+(r*r*r); //495
		}
		if(reserve==actual) {
			System.out.println(actual+" is an armstrong num");
		} else {
			System.out.println(actual+" is not an armstrong num");
		}
		return actual;
	}
		
}
