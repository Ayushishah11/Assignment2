//Java program to demonstrate static variable.

package Java;

public class Q6_DemonstrateStatic {

	// initializing static variable.
	static int ab = 22;
	
	Q6_DemonstrateStatic(){
	
	// incrementing static value.	
	ab++;
	
	// Print variable.
	System.out.println(ab);
		
	}
	
	public static void main(String[] args) {
	
		// creating constructor objects single copy is shared by all objects.
		Q6_DemonstrateStatic v = new  Q6_DemonstrateStatic();
		Q6_DemonstrateStatic v1 = new Q6_DemonstrateStatic();
		Q6_DemonstrateStatic v2 = new Q6_DemonstrateStatic();
		
			
		
	}

}
/*23
24
25
*/
