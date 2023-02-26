package asignment4;

public class FindCharOccurance {
	public static void main(String[] args) {
		  //Declare the String 'a'
		String a="Testleaf";
		//Declare 'b'=0;
		int b=0;
		 //Use toCharArray
		char[] charArray = a.toCharArray();
		//Use for loop to iterate the the values
		for (int i = 0; i < charArray.length; i++) {
			//Use if condition
			if(charArray[i]=='e') {
		            b++;
			}
		}
		System.out.println("Occurance:"+b);
	}

}
