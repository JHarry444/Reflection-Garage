package com.qa.garage;

public class Bike extends Vehicle {

	private boolean hasSideCar;

	public Bike(int weight, int noOfWheels, boolean hasSideCar) {
		super(weight, noOfWheels);
		this.setHasSideCar(hasSideCar);
	}

	public boolean isHasSideCar() {
		return this.hasSideCar;
	}

	public void setHasSideCar(boolean hasSideCar) {
		this.hasSideCar = hasSideCar;
	}

	@Override
	public float calcBill() {
		float bill = 0.0f;
		
		bill += this.getNoOfWheels() * 50 + this.getWeight() * 2;
		if (this.isHasSideCar()) {
			bill *= 20;
		}
		return bill;
	}

}
