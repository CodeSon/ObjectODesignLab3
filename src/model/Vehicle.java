package model;

public class Vehicle {
	private String regNummer;
	private String type;
	private String model;
	private int year;

	public Vehicle(String regNummer, String type, String model, int year) {

		this.regNummer = regNummer;
		this.type = type;
		this.model = model;
		this.year = year;

	}

	public String getRegNummer() {
		return regNummer;
	}

	public String getType() {
		return type;
	}

	public String getModel() {
		return model;
	}

	public int getYear() {
		return year;
	}
}
