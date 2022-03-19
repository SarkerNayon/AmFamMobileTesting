package selfPractice;

public class PalendromeNum {

	public static void main(String[] args) {
          getPalendrome(121);
	}
	public static int getPalendrome(int num) {
		int r;
		int actual=0;
	    int temp=num;
		
	    while(num>0) {
	    	r=num%10;
	    	num=num/10;
	    	actual=actual*10+r;
	    }
	    if(temp==actual) {
	    	System.out.println(actual+" is a palendrome number");
	    }else {
	    	System.out.println(actual+" is not a palendrome number");
	    }
	    return actual;
	}

}
