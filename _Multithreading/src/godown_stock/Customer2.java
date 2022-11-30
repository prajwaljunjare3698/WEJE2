package godown_stock;

public class Customer2 extends Thread {
	Godown godown;
	public Customer2(Godown godown) {
		super();
		this.godown = godown;
	}
	public void run() {
		godown.orderProduct(70);
	}
}