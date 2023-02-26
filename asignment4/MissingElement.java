package asignment4;

import java.util.Arrays;

public class MissingElement {
	  public static void main(String[] args) {
		//Declare Array 'a'
		  int[] a={2,5,6,8,9,1,3,4};
		//Use Arrays.sort() to arrange the values in Ascending order
		  Arrays.sort(a);
		//Use for loop to iterate the values
		  for (int i = 0; i< a.length; i++) {
	    //Use if condition to compare 
			  if(a[i]!=i+1) {
				 System.out.println(i+1);
		//Use break to terminate from the loop
				 break;
			  }
		}
		  
	}

}
