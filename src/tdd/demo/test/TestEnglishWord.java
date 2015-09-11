/*******************************************************************************
 * Copyright (c) 2013 Advantest. All rights reserved.
 *
 * Contributors:
 *     Advantest - initial API and implementation
 *******************************************************************************/
package tdd.demo.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import tdd.demo.NumToEnglishWord;

public class TestEnglishWord {

	@Test
	public void test_0_return_Zero() {
		NumToEnglishWord ew = new NumToEnglishWord();
		String word = ew.convert2EnglishWord(0);
		assertEquals("zero",word);
	}
	
	@Test
	public void test_1_return_One() {
		NumToEnglishWord ew = new NumToEnglishWord();
		String word = ew.convert2EnglishWord(1);
		assertEquals("one",word);
	}

	@Test
	public void test_10_return_Ten() {
		NumToEnglishWord ew = new NumToEnglishWord();
		String word = ew.convert2EnglishWord(10);
		assertEquals("ten",word);
	}
	
	@Test
	public void test_15_return_Fifteen() {
		NumToEnglishWord ew = new NumToEnglishWord();
		String word = ew.convert2EnglishWord(15);
		assertEquals("fifteen",word);
	}
	
	@Test
	public void test_16_return_sixteen() {
		NumToEnglishWord ew = new NumToEnglishWord();
		String word = ew.convert2EnglishWord(16);
		assertEquals("sixteen",word);
	}
	
	@Test
	public void test_18_return_eighteen() {
		NumToEnglishWord ew = new NumToEnglishWord();
		String word = ew.convert2EnglishWord(18);
		assertEquals("eighteen",word);
	}
	
	@Test
	public void test_20_return_tweenty() {
		NumToEnglishWord ew = new NumToEnglishWord();
		String word = ew.convert2EnglishWord(18);
		assertEquals("eighteen",word);
	}
}
