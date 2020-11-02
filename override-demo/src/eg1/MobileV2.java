package eg1;

public class MobileV2 extends MobileV1 {
	public void browsing() {
		System.out.println("Browsing feature from V2");
	}
	
	public void socialNetworkApps() {
		System.out.println("Social Apps from V2");
	}
	
	//@Override
	public void displayMenu() {  // same parameter list in parent & child
		// protected is fine
		//super().displayMenu();
		// cannot reduce visibility, i.e. switch to private is not allowed
		System.out.println("Mobile Menu in V2 is updated to GRID view");
	}
}

