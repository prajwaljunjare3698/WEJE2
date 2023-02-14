package com.jspider.springrest.controller;

public class Rushya {
	public static void main(String[] args) {
		String s = "abdfadbaddbbddda";
		char ch[] = s.toCharArray();
		
		for(int i=0;i<ch.length;i++) {
			int count = 1;
			if(ch[i] != '$') {
				for(int j=i+1;j<ch.length;j++) {
					if(ch[i]==ch[j]) {
						count++;
						ch[j]='$';
					}
				}				
				System.out.println(ch[i]+" "+count);
			}
		}
	}
}
 