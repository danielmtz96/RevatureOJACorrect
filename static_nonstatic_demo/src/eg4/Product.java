package eg4;

public class Product {
// name and cost are global but are instance or object-level. You can access them only with the help of objects.
	// every object will have its own name and own cost.
	// discount will be common among all products.
	
	String name;
	float cost;
	static float discount = 9.5f;
	public static void main(String[] args) {
		Product p1 = new Product();
		System.out.println("Printing p1");
		p1.name = "TV";
		p1.cost = 89.99f;
		
		p1.printProduct();
		
		Product p2 = new Product();
		System.out.println("Printing p2");
		p2.name = "Laptop";
		p2.cost = 189.99f;
		p2.printProduct();
		
		discount = 4.2f;
		System.out.println("\nPrinting p2 again");
		p2.printProduct();
		
		// can rename p1
		p1.name = "Television";
		System.out.println("\nPrinting p1 again");
		p1.printProduct();
		
		// change to discount is done to all objects. This is the "magic" of static.

	}
	
	public void printProduct() {
		System.out.println("Product Name : " + name);
		System.out.println("Product Cost: " + cost);
		System.out.println("Product discount : " + discount);
	}
}
