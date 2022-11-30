package godown_stock;

public class Supplier extends Thread {
	Godown godown;

	public Supplier(Godown godown) {
		super();
		this.godown = godown;
	}
	
	public void run() {
		godown.orderSupply(50);
	}
}
