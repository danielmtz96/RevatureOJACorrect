package eg1;

import java.util.Scanner;

public class Demo1 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Name");
		//String name = scanner.next(); // only next word
		String name = scanner.nextLine(); // entire next line
		
		System.out.println("Enter Age");
		//int age = scanner.nextInt();  // this line will cause problems
		
		int age = Integer.parseInt(scanner.nextLine());
		System.out.println("Enter salary: ");
		double salary = Double.parseDouble(scanner.nextLine());
		System.out.println("Hello " + name);
		System.out.println("Age: " + age);
		System.out.println("Salary: " + salary);
		
	}
}
