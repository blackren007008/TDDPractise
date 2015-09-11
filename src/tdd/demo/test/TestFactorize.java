package tdd.demo.test;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import tdd.demo.Factorize;

/*******************************************************************************
 * Copyright (c) 2013 Advantest. All rights reserved.
 *
 * Contributors:
 *     Advantest - initial API and implementation
 *******************************************************************************/

public class TestFactorize {
	Factorize f ;
	ArrayList<Integer> allFactors ;
	ArrayList<Integer> expectFactors;
	
	@Before
	public void before(){
		f = new Factorize();
		allFactors = new ArrayList<Integer>();
		expectFactors = new ArrayList<Integer>();
	}
	
	@Test
	public void test_1_return_empty() {
		allFactors = f.getAllPrimeFactor(1);
		assertEquals(0,allFactors.size());
	}
	
	@Test
	public void test_2_return_2() {
		allFactors = f.getAllPrimeFactor(2);
		expectFactors.add(new Integer(2));
		assertEquals(expectFactors,allFactors);
	}
	
	@Test
	public void test_3_return_3() {
		allFactors = f.getAllPrimeFactor(3);
		expectFactors.add(new Integer(3));
		assertEquals(expectFactors,allFactors);
	}
	
	@Test
	public void test_4_return_2_2() {
		allFactors = f.getAllPrimeFactor(4);
		expectFactors.add(new Integer(2));
		expectFactors.add(new Integer(2));
		assertEquals(expectFactors,allFactors);
	}
	
	@Test
	public void test_6_return_2_3() {
		allFactors = f.getAllPrimeFactor(6);
		expectFactors.add(new Integer(2));
		expectFactors.add(new Integer(3));
		assertEquals(expectFactors,allFactors);
	}
	
	@Test
	public void test_8_return_2_2_2() {
		allFactors = f.getAllPrimeFactor(8);
		expectFactors.add(new Integer(2));
		expectFactors.add(new Integer(2));
		expectFactors.add(new Integer(2));
		assertEquals(expectFactors,allFactors);
	}
	
	@Test
	public void test_9_return_3_3() {
		allFactors = f.getAllPrimeFactor(9);
		expectFactors.add(new Integer(3));
		expectFactors.add(new Integer(3));
		assertEquals(expectFactors,allFactors);
	}
}
