package model;
import java.util.LinkedList;

import controller.InspectionQueue;
import controller.Controller;

public class WorkOrder {
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	private Vehicle vehicle;
	
	/**
	 * LinkedList declaration so as to be able to add a 
	 * new work order to the list or to get the next work order in line
	 */
	private LinkedList<WorkOrderItem> checkList = new LinkedList<WorkOrderItem> ();
	
	
	public WorkOrder(Vehicle vehicle){
		this.setVehicle(vehicle);
		
		
		
	} 
	
	public void addItem(WorkOrderItem item){
		
		this.checkList.add(item);
	}
	
	public LinkedList<WorkOrderItem> getChecklist() {
		return this.checkList;
	}
	
	 public Receipt createReciept(){
		 
		Receipt receipt = new Receipt(checkList);
		return receipt;
		
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	 
	
	
	
	
	
	

}
