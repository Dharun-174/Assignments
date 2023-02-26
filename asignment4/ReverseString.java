package asignment4;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		System.out.println("Enter Name:");
		//Use Scanner() to get input in runtime
		Scanner a=new Scanner(System.in);
		String ab = a.next();
		//Use toCharArray()
		char[] charArray = ab.toCharArray();
		System.out.println("Reverse Name:");
		//Use reverse for loop to print the char in reverse
		for (int i =charArray.length-1; i>=0; i--) {
			System.out.print(charArray[i]);
		}
	}
}
