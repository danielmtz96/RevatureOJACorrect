package eg1;

public class EMSMain {
	public static void main(String[] args) {
		
		System.out.println("Accessing EMS using RevatureEmployer");
		EMS revEmp = new RevatureEmployer();
		revEmp.addEmployee();
		revEmp.commonEmployeeBenefits();
		revEmp.updateEmployee();
		revEmp.calculateEmployeeSalary();
		revEmp.readEmployee();
		revEmp.deleteEmployee();
		
		System.out.println("\nAccessing EMS using ABC Employer");
		EMS ABCEmp = new ABCEmployer();
		ABCEmp.addEmployee();
		ABCEmp.commonEmployeeBenefits();
		ABCEmp.updateEmployee();
		ABCEmp.calculateEmployeeSalary();
		ABCEmp.readEmployee();
		ABCEmp.deleteEmployee();
	}
}
