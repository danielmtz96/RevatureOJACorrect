package eg1;

public class MobileMain {
	public static void main(String[] args) {
		MobileV2 v2 = new MobileV2();
		v2.browsing();
		v2.calling();
		v2.message();
		v2.gaming();
		v2.displayMenu();
		v2.socialNetworkApps();
		
		
		/*
		 * Object casting applicable only in inheritance & also only & only between parent & child (not even siblings)
		 * Parent - larger (V1)
		 * Child - smaller (V2)
		 * Implicit - child class object to parent
		 * Explicit - parent to child
		 */
		
		// mobile V2 has 6 features
		// what if MobileV1 needs to access displayMenu from MobileV2?
		
		
		// implicit casting
		System.out.println("\nCasting V1\n");
		// new MobileV2(); //load all methods from Object, MobileV1, MobileV2 
		
		MobileV1 v1 = new MobileV2();  //MobileV1 object is now able to access updated displayMenu method
		// v1 is reference to V2
		v1.displayMenu(); 
		//v1.browsing(); MobileV1 *cannot* access methods unique to MobileV2
		
		//MobileV1 v11 = new MobileV1();
		
		// explicit casting
		System.out.println("\nCasting V2\n");
		MobileV2 v22 = (MobileV2)v1; // if we use v11 we'll get a ClassCastException
		v22.socialNetworkApps(); 
		v22.displayMenu();
		
		
	}
}
