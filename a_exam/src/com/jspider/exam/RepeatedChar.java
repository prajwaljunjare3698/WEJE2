package com.jspider.exam;

import java.util.HashMap;
import java.util.Map;

public class RepeatedChar {
	static void characterCount(String inputString)
    {
        HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();
        char[] strArray = inputString.toCharArray();

        for (char c : strArray) {
            if (charCountMap.containsKey(c)) {
                charCountMap.put(c, charCountMap.get(c) + 1);
            }
            else { 
                charCountMap.put(c, 1);
            }
        }
 
//        for (Map.Entry entry : charCountMap.entrySet()) {
//            System.out.println(entry.getKey() + " " + entry.getValue());
//        }
        System.out.println(charCountMap.toString());
    }
    public static void main(String[] args)
    {
        String str = "abdfaabbaccaa";
        characterCount(str);
    }
}
