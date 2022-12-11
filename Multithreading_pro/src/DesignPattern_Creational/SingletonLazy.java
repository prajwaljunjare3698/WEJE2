package DesignPattern_Creational;
class Single1{
	static Single1 obj;	//Lazy instatiation
	static int count;
	private Single1() {
		count++;
		System.out.println("obj created "+count+" times");
	}
	public static Single1 getObject() {
		if(obj==null) {
			return obj = new Single1();
		}
		return obj;
	}
}
public class SingletonLazy {
	public static void main(String[] args) {
		Single1.getObject();
		Single1.getObject();
		Single1.getObject();
		
		
//		Single1 obj = Single1.getObject();
//		System.out.println(obj);
//		Single1 obj2 = Single1.getObject();
//		System.out.println(obj2);
//		
		//it will create object only one time
	}
}
