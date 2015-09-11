/*******************************************************************************
 * Copyright (c) 2013 Advantest. All rights reserved.
 *
 * Contributors:
 *     Advantest - initial API and implementation
 *******************************************************************************/
package tdd.demo;

import java.util.HashMap;

public class NumToEnglishWord {
	
	private HashMap<Integer,String> intToStrMap;
	public NumToEnglishWord(){
		intToStrMap = new HashMap<Integer,String>();
		intToStrMap.put(0, "zero");
		intToStrMap.put(1, "one");
		intToStrMap.put(2, "two");
		intToStrMap.put(3, "three");
		intToStrMap.put(4, "four");
		intToStrMap.put(5, "five");
		intToStrMap.put(6, "six");
		intToStrMap.put(7, "seven");
		intToStrMap.put(8, "eight");
		intToStrMap.put(9, "nine");
		intToStrMap.put(10, "ten");
		intToStrMap.put(11, "eleven");
		intToStrMap.put(12, "twelve");
		intToStrMap.put(13, "thirteen");
		intToStrMap.put(14, "fourteen");
		intToStrMap.put(15, "fifteen");
		intToStrMap.put(16, "sixteen");
		intToStrMap.put(17, "seventeen");
		intToStrMap.put(18, "eighteen");
		intToStrMap.put(19, "nineteen");
		intToStrMap.put(20, "tweenty");
		intToStrMap.put(30, "thirty");
		intToStrMap.put(40, "forty");
		intToStrMap.put(50, "fifty");
		intToStrMap.put(60, "sixty");
		intToStrMap.put(70, "seventy");
		intToStrMap.put(80, "eighty");
		intToStrMap.put(90, "ninety");
		
	}
	
	public String convert2EnglishWord(int input){
		String strNum = "";
		if(input <= 15){
			return intToStrMap.get(input);
		}else if(input <= 19){
			int digNum = input%10;
			String digNumString = intToStrMap.get(digNum);
			if(digNumString.endsWith("t")){
				strNum = digNumString + "een";
			}else{
				strNum = digNumString + "teen";
			}
		}
		
		
		
		return strNum;
	}
	
	
}
