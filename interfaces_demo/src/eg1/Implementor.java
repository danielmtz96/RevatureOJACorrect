package eg1;

public class Implementor implements MyInterface1, MyInterface2, MyInterface1.InnerInterface {

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		System.out.println("Hello from MyInterface1 method1() x = " + MyInterface1.X);
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("Hello from MyInterface1 method2() x = " + MyInterface1.X);

	}

	@Override
	public void method3() {
		// TODO Auto-generated method stub
		System.out.println("Hello from MyInterface1 method3() x = " + MyInterface1.X);

	}

	@Override
	public void method4() {
		// TODO Auto-generated method stub
		System.out.println("Hello from MyInterface1 method1() x = " + MyInterface1.X);

	}
	
	
	
	public void common() {
		System.out.println("Hello from common() for MyInterface1 x = " + MyInterface2.X);	
	}

	@Override
	public void hello1() {
		// TODO Auto-generated method stub
		System.out.println("Hello1 from MyInterface2 x = " + MyInterface2.X);
		
	}

	@Override
	public void hello2() {
		// TODO Auto-generated method stub
		System.out.println("Hello2 from MyInterface2 x = " + MyInterface2.X);

	}

	@Override
	public void hello3() {
		// TODO Auto-generated method stub
		System.out.println("Hello3 from MyInterface1, MyInterface2");

	}

	@Override
	public void inner1() {
		// TODO Auto-generated method stub
		System.out.println("Hello from inner1()");
		
	}

	@Override
	public void inner2() {
		// TODO Auto-generated method stub
		System.out.println("Hello from inner2()");
	}

}
