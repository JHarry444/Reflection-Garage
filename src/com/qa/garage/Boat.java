package com.qa.garage;

public class Boat extends Vehicle {

	private boolean sail;

	public Boat() {
		super();
	}

	@Override
	public float calcBill() {
		return 4494;
	}

	public boolean isSail() {
		return this.sail;
	}

	public void setSail(boolean sail) {
		this.sail = sail;
	}

	@Override
	public String toString() {
		return "Boat [hasSail=" + this.isSail() + ", getWeight()=" + this.getWeight() + ", getNoOfWheels()="
				+ this.getNoOfWheels() + ", getId()=" + this.getId() + "]";
	}

}
