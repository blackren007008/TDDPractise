/*******************************************************************************
 * Copyright (c) 2013 Advantest. All rights reserved.
 *
 * Contributors:
 *     Advantest - initial API and implementation
 *******************************************************************************/
package tdd.demo;

public class Wrapper {

	
	public static String wrap(String str, int pos){
		
		if(str==null || str.length() <= pos){
			return str;
		}else{
			String preStr = str.substring(0,pos);
			int len = preStr.lastIndexOf(" ");
			if(len >= 0){
				return preStr.substring(0, len) + "\n" + wrap(str.substring(len+1),pos) ;
				 
			}else{
				return preStr + "\n" + wrap(str.substring(pos),pos);
			}
		}
	}
}
