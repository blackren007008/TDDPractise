/*******************************************************************************
 * Copyright (c) 2013 Advantest. All rights reserved.
 *
 * Contributors:
 *     Advantest - initial API and implementation
 *******************************************************************************/
package tdd.cellworld;

import java.util.ArrayList;
import java.util.List;


public class CellWorld {

	private ValuePair size = new ValuePair();
	
	private List<ValuePair> liveCellList = new ArrayList<ValuePair>();
	
	public void setSize(int x, int y){
		size.setX(x);
		size.setY(y);
	}
	
	public ValuePair getSize(){
		return size;
	}
	
	public void addLiveCell(ValuePair liveCell) throws Exception{
		if(liveCell.getX() > size.getX() || liveCell.getY() > size.getY()){
			throw new Exception("Cell is out of cell world bound");
		}
		liveCellList.add(liveCell);
	}
	
	public String printCellWorld(){
		System.out.println(buildCellWorld());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		updateLiveCellList();
		System.out.println(buildCellWorld());
		return buildCellWorld();
	}

	private String buildCellWorld() {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < size.getY(); i++) {
			for (int j = 0; j < size.getX(); j++) {
				
				boolean isLiveCell = false;
				for (ValuePair cell : liveCellList) {
					if (cell.getX() == i && cell.getY() == j) {
						sb.append("*");
						isLiveCell = true;
						break;
					}
				}
				
				if(!isLiveCell){
					sb.append(".");
				}
			}
			sb.append("\n");
		}	
		return sb.toString();
	}
	
	public void updateLiveCellList(){
		List<ValuePair> liveCellListNew = new ArrayList<ValuePair>();
		for(ValuePair liveCell : liveCellList){
			int count = 0;
			for(ValuePair liveCellInner : liveCellList){
				if(liveCell.equals(liveCellInner)){
					continue;
				}
				
				if((liveCellInner.getX()==liveCell.getX() &&  Math.abs(liveCellInner.getY()-liveCell.getY()) == 1)
						|| (liveCellInner.getY()==liveCell.getY() && Math.abs(liveCellInner.getX()-liveCell.getX()) == 1)
						|| (Math.abs(liveCellInner.getX()-liveCell.getX()) == 1 && Math.abs(liveCellInner.getY()-liveCell.getY()) == 1)){
					count += 1;
				}
			}
			if(count == 2 || count == 3){
				liveCellListNew.add(liveCell);
			}
		}
		
		liveCellList.clear();
		liveCellList.addAll(liveCellListNew);
	}
	
}
