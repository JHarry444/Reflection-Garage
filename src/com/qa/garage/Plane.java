package com.qa.garage;

public class Plane extends Vehicle {

	private boolean propellor;

	public Plane(int weight, int noOfWheels, boolean propellor) {
		super(weight, noOfWheels);
		this.setPropellor(propellor);
	}

	public boolean isPropellor() {
		return this.propellor;
	}

	public void setPropellor(boolean propellor) {
		this.propellor = propellor;
	}

	@Override
	public float calcBill() {
		float bill = 0.0f;
		bill += this.getNoOfWheels() * 50 + this.getWeight() * 2;
		if (this.isPropellor()) {
			bill /= 2;
		}
		return bill;
	}

}
