package eg2;

import java.io.FileNotFoundException;
import java.io.FileInputStream;

public class BusinessLogic {
	// FileNotFound exception
	// write throws here
	public void openFile(String fileName) throws FileNotFoundException{
		
		FileInputStream fis = new FileInputStream(fileName);
		
	}
}
