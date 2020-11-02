package eg2;

public class Employee {
	private int id;
	private String name;
	private long contact;
	// some new employees will also register city and email
	private String city;
	private String email;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String name, long contact) {
		// local variables passed become instance variables of Employee
		super();
		this.id = id;
		this.name = name;
		this.contact = contact;
	}
	
	// updating employee info
	public void setCity(String city) {
		this.city = city;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	// code repetition
	public Employee(int id, String name, long contact, String city, String email) {
		this(id, name, contact); // constructor chaining, remove super()
		// performs the same function as:
		/*this.id = id;
		this.name = name;
		this.contact = contact;
		*/
		this.city = city;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getContact() {
		return contact;
	}

	public void setContact(long contact) {
		this.contact = contact;
	}

	public String getCity() {
		return city;
	}

	public String getEmail() {
		return email;
	}

/*	public void printEmployee() {
		System.out.println("Id: " + id);
		System.out.println("Name: " + name);
		System.out.println("contact: " + contact);
		System.out.println("City: "+ city);
		System.out.println("Email: " + email);
	}*/
	
	
	// suppose I want to access employee data without printEmployee(), how? with getters

	
}
