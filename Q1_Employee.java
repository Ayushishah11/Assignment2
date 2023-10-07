//Java program to create string name and integer id variable and create two objects and initialize with details.

package Java;

public class Q1_Employee {

	// creating variables integer and string.
	int id;
	String name;
	
	//creating parameterized constructor.
	Q1_Employee(int id,  String name){
		
		// Using this keyword to refer constructor variables.
		this.id = id;
		this.name = name;
	}
	
	// User define method to display employee information.
	public void display() {
		
	System.out.println("Employee Id is : "+id+" Employee Name is : "+name);
	
	}
	
	public static void main(String[] args) {
	
		// Initializing constructor variables. 
		Q1_Employee a = new Q1_Employee(1, "Ayushi");
		Q1_Employee b = new Q1_Employee(2, "Aaradhya");
		
		// calling display method.
		a.display();
		b.display();

	}

}
/*Employee Id is : 1 Employee Name is : Ayushi
Employee Id is : 2 Employee Name is : Aaradhya
*/