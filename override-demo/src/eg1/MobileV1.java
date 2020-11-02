package eg1;

public class MobileV1 {
	public void calling() {
		System.out.println("Calling feature of V1");
	}
	
	public void message() {
		System.out.println("Send message feature of V1");
	}
	
	public void gaming() {
		System.out.println("Gaming feature of V1");
	}
	
	// use @Override to make sure parent method is in fact being overriden 
	public void displayMenu() {
    //public void displaymenu() typo: our mobile menu should be updated, but it didn't!
		
		System.out.println("Mobile menu in V1 displays in LIST view");
	}
	
	// what all cannot we override?
	// static, private, final
	
	// increasing visibility from parent in the child
	// public > protected > default > private
	
	// Java 7 -> Annotations (@)
	
}
