package com.qa.garage;

public abstract class Vehicle {

	private int weight;
	private int noOfWheels;

	private final int id;

	private static int currentId = 0;

	public Vehicle(int weight, int noOfWheels) {
		super();
		this.setWeight(weight);
		this.setNoOfWheels(noOfWheels);
		this.id = ++currentId;
	}

	public abstract float calcBill();

	public int getWeight() {
		return this.weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getNoOfWheels() {
		return this.noOfWheels;
	}

	public void setNoOfWheels(int noOfWheels) {
		this.noOfWheels = noOfWheels;
	}

	public int getId() {
		return this.id;
	}
//
//	public void setId(int id) {
//		this.id = id;
//	}

}
