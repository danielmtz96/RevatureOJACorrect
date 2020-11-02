package examples;

public class TitleCaseDemo {
	public static void main(String[] args) {
		String s = "hello hi good morning I am enjoying programming with java";
		
		// convert every word's first letter to uppercase, & print back whole sentence with upper case
		StringBuilder sb = new StringBuilder();
		String ar[] = s.split(" ");
		/* 
		for(String s1: ar) {
			sb.append(Character.toUpperCase(s1.charAt(0))).append(s1.substring(1)).append(" ");
			// what does this all do?
		} 
		System.out.println(sb.toString().trim());
		*/
		
		// task: convert every word's last char to upper case
		for(String s1: ar) {
			// what does this all do?
			//sb.append(Character.toUpperCase(s1.charAt(s1.length() - 1))).append(s1.substring(0));
			sb.append(s1.substring(0, s1.length() -1)).append(Character.toUpperCase(s1.charAt(s1.length() - 1))).append(" ");
		}
		System.out.println(sb);
	}
}
