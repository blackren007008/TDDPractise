package tdd.demo;
import java.util.ArrayList;

/*******************************************************************************
 * Copyright (c) 2013 Advantest. All rights reserved.
 * 
 * Contributors: Advantest - initial API and implementation
 *******************************************************************************/

public class Factorize {

	public ArrayList<Integer> getAllPrimeFactor(int value) {
		
		ArrayList<Integer> factors = new ArrayList<Integer>();

		for(int i=2; i<=value; i++){
			while (value % i == 0) {
				factors.add(i);
				value = value/i;
			}
		}
		
//		if (value != 1) {
//			factors.add(value);
//		}

		return factors;
	}

	// public boolean isPrimeFactorize(int factor){
	//
	// // for(int i=2; i<(factor/2)+1; i++){
	// // if(factor%i == 0){
	// //
	// // }
	// // }
	//
	// return ;
	// }
}
