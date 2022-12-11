package DesignPattern_Creational;
class A{
	
	static A obj = new A();//Eger instatiation
	static int count;
	private A() {
		count++;
		System.out.println("obj created "+count+" times");
	}
	public static A getObject() {
		return obj;
	}
}
public class SingletonEger {
	public static void main(String[] args) {
		A.getObject();
		A.getObject();
		A.getObject();
		A.getObject();
	}
}
