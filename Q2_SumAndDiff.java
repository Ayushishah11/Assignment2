//Java program to find sum and difference of two numbers using static methods.

package Java;



public class Q2_SumAndDiff{

	// creating static method sum.
	static int sum(int x, int y) {
		
		return x + y; 
	}
	
	// creating static method diff.
	static int diff(int x, int y) {
		
		return x - y;
	}
	
	public static void main(String[] args) {
	
		Q2_SumAndDiff d= new Q2_SumAndDiff();
		
		// Print sum and difference.
		System.out.println("Sum of two number is : "+d.sum(12,5));
		System.out.println("Difference between to number is : "+d.diff(10,8));
	}

}
/*Sum of two number is : 17
Difference between to number is : 2
*/