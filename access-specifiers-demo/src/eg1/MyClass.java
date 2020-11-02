package eg1;

public class MyClass {
	public static void mystatic() {
		System.out.println("Hello from mystatic");
	}
	
	public void myNonStatic() {
		System.out.println("Hello from myNonStatic");
	}
	private class InnerPrivate{
		
	}
	protected class InnerProtected{
		
	}
	public class InnerPublic{
		public void helloInnerPublic() {
			System.out.println("Hello from helloInnerPublic");
		}
		// error: can't have static method in inner non-static class
		public static void helloInnerPublicStatic() {
			
		}
		public class InnerInnerPublic{
			
		}
	}
	public static class InnerStaticPublic{
		public static void helloInnerPublicStatic() {
			System.out.println("Hello from helloInnerPublicStatic");
		}
		public void helloInnerStaticNonStatic() {
			System.out.println("Hello from helloInnerPublicNonStatic");
		}
	}
}
