package custom;

public class ValidationMain { // presentation layer
	/* new features:
	 * GmailException (to make sure the only registered emails are gmail.com)
	 * SSNException: valid social security number
	 */
	public static void main(String[] args) {
		
		Validation v = new Validation();
		
		try {
			if (v.isValidAge(20)) {
				System.out.println("Age Validated");
			}
		} catch (BusinessCheckedException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			if (v.isValidMobileNumber("+1-9567636513")) {
				System.out.println("Mobile number validated");
			}
		} catch(BusinessUncheckedException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			if(v.isValidGmail("danmargut@hotmail.com")) {
				System.out.println("Gmail validated.");
			} 
		} catch(GmailException e) {
				System.out.println(e.getMessage());
			}
		
		try {
			if (v.isValidSocial("000-000-0000")) {
				System.out.println("Social security number validated.");
			}
		} catch (SSNException e) {
			System.out.println(e.getMessage());
		}
	   
	}
}
