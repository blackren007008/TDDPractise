/*******************************************************************************
 * Copyright (c) 2013 Advantest. All rights reserved.
 *
 * Contributors:
 *     Advantest - initial API and implementation
 *******************************************************************************/
package tdd.demo.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import tdd.demo.Wrapper;


public class TestWrapper {
	
	@Test
	public void test_null_return_null() {
		String str = Wrapper.wrap(null, 10);
		assertEquals(null,str);
	}
	
	@Test
	public void test_less_than_len() {
		String str = Wrapper.wrap("ab", 10);
		assertEquals("ab",str);
	}
	
	@Test
	public void test_long_than_len_without_space() {
		String str = Wrapper.wrap("abcdefg", 5);
		assertEquals("abcde\nfg",str);
	}
	
	@Test
	public void test_long_equal_len_() {
		String str = Wrapper.wrap("abcde", 5);
		assertEquals("abcde",str);
	}
	
	@Test
	public void test_long_equal_len_with_space() {
		String str = Wrapper.wrap(" abcde", 5);
		assertEquals("\nabcde",str);
	}
	
	@Test
	public void test_very_long_than_len_without_space() {
		String str = Wrapper.wrap("12345123451234", 5);
		assertEquals("12345\n12345\n1234",str);
	}
	
	@Test
	public void test_word_with_space() {
		String str = Wrapper.wrap("12345 abcd", 7);
		assertEquals("12345\nabcd",str);
	}
	
	@Test
	public void test_word_with_many_space() {
		String str = Wrapper.wrap("12345 abcd 1234", 7);
		assertEquals("12345\nabcd\n1234",str);
	}
	
	@Test
	public void test_word_with_many_space_longpos() {
		String str = Wrapper.wrap("12345 12345 1234", 13);
		assertEquals("12345 12345\n1234",str);
	}
	
	@Test
	public void test_word_with_many_space_with_mid() {
		String str = Wrapper.wrap("12345 abcde", 5);
		assertEquals("12345\n\nabcde",str);
	}
}
