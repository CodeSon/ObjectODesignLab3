package model;

public class WorkOrderItem {

	private String description;
	private double price;

	/**
	 * 
	 * @param description
	 *            describes the kind of inspection to be performed
	 * @param price
	 *            is also shown at the end of the description
	 */
	public WorkOrderItem(String description, double price) {

		this.description = description;
		this.price = price;

	}

	public String getDescription() {
		return description;
	}

	public double getPrice() {
		return price;
	}

}
