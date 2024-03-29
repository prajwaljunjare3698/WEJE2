package com.jspider.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class OnetoAnother {
	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<>(Arrays.asList(2,3,4,5,56));
		ArrayList<Integer> b = new ArrayList<>(a);
		//System.out.println(b);
		
		ArrayList<Integer> c = new ArrayList<>();
		c.addAll(a);
		c.addAll(a);	//many time i can add...!
		c.addAll(a);
		//System.out.println(c);
		
		HashMap<Integer, String> h1 = new HashMap<>();
		h1.put(1, "first");
		h1.put(2, "second");
		h1.put(3, "third");
		
		HashMap<Integer, String> h2 = new HashMap<>(h1);
		System.out.println(h2); 
		
		HashMap<Integer, String> h3 = new HashMap<>();
		h3.putAll(h2);
		System.out.println(h3);
		
	}
}
