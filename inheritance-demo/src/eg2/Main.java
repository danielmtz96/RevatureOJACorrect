package eg2;

public class Main {
	public static void main(String[] args) {
		
		Employee e1 = new Employee(100, "Dave", "Trainer", 123344.33);
		e1.printEmployee();
		
		System.out.println("\n");
		Employee e2 = new Employee(101, "Kishore", "Trainee", 123344.33);
		e2.printEmployee();
		
		Team team = new Team(98989, "Studs", "Studder");
		Player p = new Player(900, "Richard", 77.7, team);
		p.printPlayer();
		
		
	}
}
