package godown_stock;

public class SupplyMain {
	public static void main(String[] args) {
		Godown godown = new Godown(100);
		Customer1 cust1 = new Customer1(godown);
		Customer2 cust2 = new Customer2(godown);
		Supplier supply = new Supplier(godown);
		
		cust1.start();
		cust2.start();
		supply.start();
		System.out.println(args);
		
	}
}
