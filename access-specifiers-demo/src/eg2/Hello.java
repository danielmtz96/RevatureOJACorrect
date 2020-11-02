package eg2;

public class Hello {
	private void helloPrivate() {
		// this method can only be used locally, but we have an error message because it's never used
		System.out.println("Hello from helloPrivate");
	}
	
	public void helloPublic() {
		System.out.println("Hello from helloPublic");
	}
	
	protected void helloProtected() {
		System.out.println("Hello from HelloProtected");
	}
	
	void helloDefault() {
		System.out.println("Hello from helloDefault");
	}
}
