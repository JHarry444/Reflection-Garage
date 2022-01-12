package com.qa.garage;

public class Car extends Vehicle {

	private int bootSize;

	public Car(int weight, int noOfWheels, int bootSize) {
		super(weight, noOfWheels);
		this.setBootSize(bootSize);
	}

	public int getBootSize() {
		return this.bootSize;
	}

	public void setBootSize(int bootSize) {
		this.bootSize = bootSize;
	}

	@Override
	public float calcBill() {
		// TODO Auto-generated method stub
		return this.getNoOfWheels() * 50 + this.getWeight() * 2 + this.getBootSize() * 20;
	}

}
