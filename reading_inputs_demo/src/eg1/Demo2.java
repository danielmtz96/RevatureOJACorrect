package eg1;
// see his code
// using getters and setters
import java.util.Scanner;

public class Demo2 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		// read everything as a String, and then parse it
		Employee e2 = new Employee();
		
		System.out.println("Enter Name");
		//String name = scanner.next(); // only next word
		e2.setName(scanner.nextLine());
		System.out.println("Enter Age");
		e2.setAge(Integer.parseInt(scanner.nextLine()));
		System.out.println("Enter salary: ");
		e2.setSalary(Double.parseDouble(scanner.nextLine()));
		
		// e2 properties like e2.name, e2. salary, e2.age are private, so we 
		// can't access them here.
		System.out.println("e2 = " + e2);
			
		
	}
}

