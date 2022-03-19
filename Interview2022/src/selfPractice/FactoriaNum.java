package selfPractice;

public class FactoriaNum {

	public static void main(String[] args) {
	int	result=getFactorial(3);
	System.out.println(result);
	}
	public static int getFactorial(int num) {
		int temp=num;
		
		for(int i=num-1;i>0;i--) {
			temp=temp*i;
		}
		return temp;
	}

}
