package eg1;

public abstract class EMS { // employment management system
	
	public abstract void addEmployee();
	public abstract void updateEmployee();
	public abstract void readEmployee();
	public abstract void calculateEmployeeSalary();
	public abstract void deleteEmployee();
	public void commonEmployeeBenefits() {
		System.out.println("Common Emp benefits to any employees in the world.");
	}

}
