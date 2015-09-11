/*******************************************************************************
 * Copyright (c) 2013 Advantest. All rights reserved.
 *
 * Contributors:
 *     Advantest - initial API and implementation
 *******************************************************************************/
package tdd.cellworld.test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import tdd.cellworld.CellWorld;
import tdd.cellworld.ValuePair;

public class TestCellWorld {
	
	private CellWorld cw;
	
	@Rule
	public final ExpectedException e = ExpectedException.none();
	
	@Before
	public void before(){
		cw = new CellWorld();
	}

//	@Test
//	public void testSize(){
//		cw.setSize(4, 5);
//		assertEquals(4,cw.getSize().getX());
//		assertEquals(5,cw.getSize().getY());
//	}
//	
//	@Test
//	public void testPrintCellWorld(){
//		cw.setSize(4, 5);
//		String cwStr = cw.printCellWorld();
//		assertEquals("....\n....\n....\n....\n....\n",cwStr);
//	}
//	
//	@Test
//	public void testStory1_AC1(){
//		givenWorldBoundStory1_AC1();
//		whenBuildWorldStory1_AC1();
//		thenDisplayWorldStory1_AC1();
//	}
//
//	@Test
//	public void testStory2_AC1()throws Exception{
//		givenWorldBoundStory2_AC1();
//		whenBuildWorldStory2_AC1();
//		thenDisplayWorldStory2_AC1();
//	}
//	
//	@Test
//	public void testStory2_AC2()throws Exception{
//		givenWorldBoundStory2_AC2();
//		whenBuildWorldStory2_AC2();
//		thenDisplayWorldStory2_AC2();
//	}
	
	@Test
	public void testStory3_AC1()throws Exception{
		givenWorldBoundStory3_AC1();
		whenBuildWorldStory3_AC1();
		thenDisplayWorldStory3_AC1();
	}
	
	@Test
	public void testStory3_AC2()throws Exception{
		givenWorldBoundStory3_AC2();
		whenBuildWorldStory3_AC2();
		thenDisplayWorldStory3_AC2();
	}
	
	@Test
	public void testStory3_AC3()throws Exception{
		givenWorldBoundStory3_AC3();
		whenBuildWorldStory3_AC3();
		thenDisplayWorldStory3_AC3();
	}
	
	@Test
	public void testStory3_AC4()throws Exception{
		givenWorldBoundStory3_AC4();
		whenBuildWorldStory3_AC4();
		thenDisplayWorldStory3_AC4();
	}
	
	private void givenWorldBoundStory1_AC1(){
		cw.setSize(4, 5);
	}

	private void whenBuildWorldStory1_AC1(){
	}

	private void thenDisplayWorldStory1_AC1(){
		assertEquals("....\n....\n....\n....\n....\n",cw.printCellWorld());
	}
	
	private void givenWorldBoundStory2_AC1(){
		cw.setSize(4, 5);
	}
	
	private void whenBuildWorldStory2_AC1() throws Exception{
		ValuePair cell1 = new ValuePair(0,0);
		ValuePair cell2 = new ValuePair(2,3);
		ValuePair cell3 = new ValuePair(1,1);
		ValuePair cell4 = new ValuePair(3,2);
		
		cw.addLiveCell(cell1);
		cw.addLiveCell(cell2);
		cw.addLiveCell(cell3);
		cw.addLiveCell(cell4);
	}

	private void thenDisplayWorldStory2_AC1(){
		assertEquals("*...\n.*..\n...*\n..*.\n....\n",cw.printCellWorld());
	}
	

	
	private void givenWorldBoundStory2_AC2(){
		cw.setSize(4, 5);
	}
	
	private void whenBuildWorldStory2_AC2() throws Exception{
		ValuePair cell1 = new ValuePair(10,10);
		e.expect(Exception.class);
		cw.addLiveCell(cell1);
	}

	private void thenDisplayWorldStory2_AC2(){}
	
	
	/**
	 * Input
	 *  ...
	 *  .*.
	 *  ...
	 *  
	 * Expect
	 *  ...
	 *  .*.
	 *  ...
	 */
	private void givenWorldBoundStory3_AC1(){
		cw.setSize(3, 3);
	}
	
	private void whenBuildWorldStory3_AC1() throws Exception{
		ValuePair cell1 = new ValuePair(1,1);
		cw.addLiveCell(cell1);
	}

	private void thenDisplayWorldStory3_AC1(){
		assertEquals("...\n...\n...\n",cw.printCellWorld());
	}
	
	/**
	 * Input
	 *  .*.
	 *  .*.
	 *  *..
	 *  
	 * Expect
	 *  ...
	 *  .*.
	 *  ...
	 */
	private void givenWorldBoundStory3_AC2(){
		cw.setSize(3, 3);
	}
	
	private void whenBuildWorldStory3_AC2() throws Exception{
		ValuePair cell1 = new ValuePair(0,1);
		ValuePair cell2 = new ValuePair(1,1);
		ValuePair cell3 = new ValuePair(2,0);
		cw.addLiveCell(cell1);
		cw.addLiveCell(cell2);
		cw.addLiveCell(cell3);
	}

	private void thenDisplayWorldStory3_AC2(){
		assertEquals("...\n.*.\n...\n",cw.printCellWorld());
	}
	
	/**
	 * Input
	 *  .*.
	 *  .**
	 *  *..
	 *  
	 * Expect
	 *  .*.
	 *  .**
	 *  ?..
	 */
	private void givenWorldBoundStory3_AC3(){
		cw.setSize(3, 3);
	}
	
	private void whenBuildWorldStory3_AC3() throws Exception{
		ValuePair cell1 = new ValuePair(0,1);
		ValuePair cell2 = new ValuePair(1,1);
		ValuePair cell3 = new ValuePair(1,2);
		ValuePair cell4 = new ValuePair(2,0);
		cw.addLiveCell(cell1);
		cw.addLiveCell(cell2);
		cw.addLiveCell(cell3);
		cw.addLiveCell(cell4);
	}

	private void thenDisplayWorldStory3_AC3(){
		assertEquals(".*.\n.**\n...\n",cw.printCellWorld());
	}
	
	/**
	 * Input
	 *  **.
	 *  .*.
	 *  *.*
	 *  
	 * Expect
	 *  **.
	 *  ...
	 *  ...
	 */
	private void givenWorldBoundStory3_AC4(){
		cw.setSize(3, 3);
	}
	
	private void whenBuildWorldStory3_AC4() throws Exception{
		ValuePair cell1 = new ValuePair(0,0);
		ValuePair cell2 = new ValuePair(0,1);
		ValuePair cell3 = new ValuePair(1,1);
		ValuePair cell4 = new ValuePair(2,0);
		ValuePair cell5 = new ValuePair(2,2);
		cw.addLiveCell(cell1);
		cw.addLiveCell(cell2);
		cw.addLiveCell(cell3);
		cw.addLiveCell(cell4);
		cw.addLiveCell(cell5);
	}

	private void thenDisplayWorldStory3_AC4(){
		assertEquals("**.\n...\n...\n",cw.printCellWorld());
	}
}
