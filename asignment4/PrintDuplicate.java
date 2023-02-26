package asignment4;

import java.util.Arrays;

public class PrintDuplicate {
	   public static void main(String[] args) {
		 //Declare a Array 'a'
		   int[] a= {11,22,33,44,55,66,22,77,11};
		 //Use Arrays.short() to arrange the values in Ascending order
		   Arrays.sort(a);
		 //Use for loop to iterate the values
		   for (int i = 0; i < a.length; i++) {
			   for (int j =i+1; j < a.length; j++) {
				//Use if condition to compare a[i] and j[i]
				   if(a[i]==a[j]) {
					   System.out.println("Duplicates are:"+a[i]);
				   }
			}
			
		}
		   
	}

}
