package DesignPattern_Creational;

public class SingletonMain {
	public static void main(String[] args) {
		Singleton s1 = Singleton.getObject();
		System.out.println(s1);
		Singleton s2 = Singleton.getObject();
		System.out.println(s2);
		Singleton s3 = Singleton.getObject();
		System.out.println(s3);		
	}
}
