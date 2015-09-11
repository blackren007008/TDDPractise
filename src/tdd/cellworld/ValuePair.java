/*******************************************************************************
 * Copyright (c) 2013 Advantest. All rights reserved.
 *
 * Contributors:
 *     Advantest - initial API and implementation
 *******************************************************************************/
package tdd.cellworld;

public class ValuePair {

	private int x;
	
	private int y;
	
	public ValuePair() {
	}
	
	public ValuePair(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public boolean equals(ValuePair cell){
		return this.x == cell.getX() && this.y == cell.getY();
	}
}
