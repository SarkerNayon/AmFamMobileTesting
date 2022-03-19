package javaChalenges;

import java.util.HashSet;
import java.util.Set;

public class FindTheDuplicate {

	public static void main(String args[]) {
	     int a[] = {11,2,2,3,4,4,4,4,4,5,6,7,2,3,3,8};
	     //int maxVar = 0;
	     Set<Integer> set = new HashSet<>();
	     int maxOccur = 0;
	     for(int i=0; i<a.length; i++) {
	    	 int occurance = 0;
	    	 for(int j =0; j < a.length; j++) {
	    		 if(a[i] == a[j]) {
	    			 occurance++;
	    		 }
	    	 }
	    	 if(occurance>maxOccur) {
	    		 maxOccur = occurance;
	    		 //maxVar = a[i];
	    	 }
	    }
	     System.out.println(maxOccur);
	     for(int i = 0; i < a.length; i++) {
	    	 int occurance = 0;
	    	 for(int j = 0; j < a.length; j++) {
	    		 if(a[i] == a[j]) {
	    			 occurance++;
	    		 }
	    	 }
	    	 if(occurance==maxOccur) {
	    		 set.add(a[i]);
	    	 }
	     }
	     System.out.println(set);
	}
}	


//for(int i =0; i<a.length; i++){
//    for(int j=0; j>a.length-1; i--){
//        while(i=j){
//            int count1++;
//            String.out.println(comNum = count1);
//        }
//    }
//
//
// System.out.println("Sum of x+y = " + z);
