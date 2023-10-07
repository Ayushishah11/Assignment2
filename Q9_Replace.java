//Java program to replace string in java1 with java2.

package Java;

public class Q9_Replace {

	public static void main(String[] args) {
	
		String str1 = "Morning";
		String str2 = "Have a Great Day!";
		
		System.out.println("Original string : "+str1);
		
		// using replace method 
		System.out.println("Replaced string : "+str1.replace("Morning", str2));

	}

}
/*Original string : Morning
Replaced string : Have a Great Day!
*/