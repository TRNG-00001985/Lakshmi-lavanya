package com.studyopedia;
import java.util.HashMap;
import java.util.Map;

public class Mcc {
	    public static void main(String[] args) {
	        String input = "hello world";
	        char mostCommonChar = findMostCommonCharacter(input);
	        
	        System.out.println("The most common character is: " + mostCommonChar);
	    }

	    public static char findMostCommonCharacter(String input) {
	        Map<Character, Integer> charCountMap = new HashMap<>();
	        int maxCount = 0;
	        char mostCommonChar = ' ';

	        for (char c : input.toCharArray()) {
	            if (c != ' ') { // Ignore spaces
	                charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);

	                if (charCountMap.get(c) > maxCount) {
	                    maxCount = charCountMap.get(c);
	                    mostCommonChar = c;
	                }
	            }
	        }

	        return mostCommonChar;
	    }
	}