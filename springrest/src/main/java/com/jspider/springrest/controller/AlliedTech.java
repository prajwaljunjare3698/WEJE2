package com.jspider.springrest.controller;

//StringChallenge(num) take the num parameter being passed and return the number of hours and minutes the parameter
//converts to (ie. if num = 63 then the output should be 1:3). Separate the number of hours and minutes with a colon : 

//ArrayChallenge(arr) take the array of numbers stored in arr and return the string "Arithmetic" 
//if the sequence follows an arithmetic pattern or return "Geometric" 
//if it follows a geometric pattern. If the sequence doesn't follow either pattern return "-1." 
//An arithmetic sequence is one where the difference between each of the numbers is consistent,
//where as in a geometric sequence, each term after the first is multiplied by some constant or common ratio. 
//Arithmetic example: [2, 4, 6, 8] and Geometric example: [2, 6, 18, 54]. Negative numbers may be entered as parameters, 
//0 will not be entered, and no array will contain all the same elements.


public class AlliedTech {
	public static void main(String[] args) {
		int arr[] = {2,3,4,5,6};
		
		System.out.println(check(arr));
	}

	private static String check(int[] arr) {
		int difAri = arr[1]-arr[0];
		int difGeo = arr[1]/arr[0];
		
		int arithmetic = 0;
		int geomatric = 0;
		
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]+difAri!=arr[i+1]) {
				arithmetic++;
			}
			if(arr[i]*difGeo!=arr[i+1]) {
				geomatric++;
			}
		}
		if(arithmetic==0) {
			return "Arithmetic";
		}
		else if(geomatric==0) {
			return "Geometric";
		}
		return "-1";
	}
}
