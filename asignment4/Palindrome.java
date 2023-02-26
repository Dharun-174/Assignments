package asignment4;

public class Palindrome {
	public static void main(String[] args) {
		//Declare a String 'a'
		String a="madam";
		//Declare a empty String 'b'
		String b="";
		//Use toCharArray 
		char[] ab=a.toCharArray();
		//Use reverse for loop to iterate the char
		for (int i=ab.length-1;i>=0; i--) {
			//Store the reverse char in 'b'
			b=b+ab[i];
		}
		//Use if condition to compare 'a' and 'b'
		if(a.equals(b)) {
			System.out.println("Given String is a Palindrome");
		}
		else 
		{
			System.out.println("It is not a Palindrome");
		}
	}
}
