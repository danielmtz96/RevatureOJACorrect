package eg2;

public class Main {
	public static void main(String[] args) {
		Child c = new Imp1();
		c.c1();
		c.p1();
		
		Parent p = new Imp1();
		p.p1();
		p.p2();
		
	}
}
