package DesignPattern_Creational;

import java.util.Scanner;

interface FastFood{
	void orderFood();
}
class Pizza implements FastFood{
	public void orderFood() {
		System.out.println("customer ordered pizza");
	}
}
class Burger implements FastFood{
	public void orderFood() {
		System.out.println("customer ordered Burger");
	}
}
class Pasta implements FastFood{
	public void orderFood() {
		System.out.println("customer ordered Pasta");
	}
}
class Fries implements FastFood{
	public void orderFood() {
		System.out.println("customer ordered Fries");
	}
}
class ColdCoffee implements FastFood{
	public void orderFood() {
		System.out.println("customer ordered ColdCoffee");
	}
}
public class CafeMain {
	static FastFood f;
	static boolean loop = true;
	public static void main(String[] args) {
		while(loop) {
			try {
				customerOrder().orderFood();
			} catch (Exception e) {
				System.out.println("customer order nothing");
			}
		}
	}
	private static FastFood customerOrder() {
		Scanner sc = new Scanner(System.in);
		System.out.println("select your order->\n 1:Pizza \n 2:Burder \n 3:Pasta \n 4:Fries \n 5:ColdCoffee");
		int choice = sc.nextInt();
		sc.close();
		switch (choice) {
		case 1: {
			f = new Pizza();
			loop = false;
			return f;
		}
		case 2: {
			f = new Burger();
			loop = false;
			return f;
		}
		case 3: {
			f = new Pasta();
			loop = false;
			return f;
		}
		case 4: {
			f = new Fries();
			loop = false;
			return f;
		}
		case 5: {
			f = new ColdCoffee();
			loop = false;
			return f;
		}
		default:
			System.out.println("invalid input");
			loop  = false;
			return f;
		}
	}
}
