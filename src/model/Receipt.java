package model;

import java.util.LinkedList;

public class Receipt {
	// a property to store the itemList
	LinkedList<WorkOrderItem> itemList;

	/**
	 * 
	 * @param checkList
	 * is chosen as the type of the receipt since the receipt needs
	 * to know what to tally up and then storing it in the checkList
	 * variable
	 */

	public Receipt(LinkedList<WorkOrderItem> checkList) {

		itemList = checkList;
	}
	
	public double getTotal() {
		// TODO Auto-generated method stub
		return 0;
	}

	public LinkedList<WorkOrderItem> getItems() {
		// TODO Auto-generated method stub
		return null;
	}

}
