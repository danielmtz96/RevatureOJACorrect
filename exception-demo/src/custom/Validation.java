package custom;

public class Validation {
	
	public boolean isValidAge(int age) throws BusinessCheckedException {
		// no built-in exception in Java to handle business requirement
		// create custom exception
		if (age <= 0) {
			throw new BusinessCheckedException("Age cannot be zero or negative");
		}
		
		if (age < 19 || age > 40) {
			throw new BusinessCheckedException("It should be between 19 and 40 only.");
		}
		
		return true;
	}
	
	public boolean isValidMobileNumber(String mobile) {
		// throw unchecked exception
		if (!mobile.matches("\\+1-[0-9]{10}")) {
			throw new BusinessUncheckedException("Entered mobile number " + mobile + " is invalid.");
			}
		return true;
	}
	
	public boolean isValidGmail(String email) {  // unchecked exception does not require throws keyword
		if (!(email.substring(email.length() - 9, email.length()).equals("gmail.com"))){
			throw new GmailException("Entered email: " + email + " is invalid.");
		}
		return true;
	}
	
	public boolean isValidSocial(String social) throws SSNException { //checked exception requires throws keyword here
		if(!social.matches("[0-9]{3}-[0-9]{2}-[0-9]{4}")){
			throw new SSNException("Entered social: " + social + " is invalid. Please enter 000-00-0000 format.");
		}
		return true;
	}
}
