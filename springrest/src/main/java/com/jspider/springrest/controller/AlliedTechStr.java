package com.jspider.springrest.controller;

public class AlliedTechStr {
	public static void main(String[] args) {
		String s = "lane borrowed";
		//String s = "after badly";
		
		int count=0;
		
		boolean flag = true;
		
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='a') {
				count++;
				if(count==4) {
					if(s.charAt(i)=='b') {
						System.out.println(true);
						flag = false;
					}
				}
			}
		}
		if(flag == true) {
			System.out.println(false);
		}
	}
}
