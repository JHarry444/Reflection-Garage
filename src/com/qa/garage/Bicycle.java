package com.qa.garage;

public class Bicycle extends Vehicle {

	private boolean hasStabilisers;

	public Bicycle() {

	}

	public Bicycle(int weight, int noOfWheels, boolean hasStabilisers) {
		super(weight, noOfWheels);
		this.setHasStabilisers(hasStabilisers);
	}

	public boolean isHasStabilisers() {
		return this.hasStabilisers;
	}

	public void setHasStabilisers(boolean hasStabilisers) {
		this.hasStabilisers = hasStabilisers;
	}

	@Override
	public float calcBill() {
		float bill = 0.0f;

		bill += this.getNoOfWheels() * 50 + this.getWeight() * 2;
		if (this.isHasStabilisers()) {
			bill *= 20;
		}
		return bill;
	}

	@Override
	public String toString() {
		return "Bicycle [hasStabilisers=" + this.isHasStabilisers() + ", getWeight()=" + this.getWeight()
				+ ", getNoOfWheels()=" + this.getNoOfWheels() + ", getId()=" + this.getId() + "]";
	}

}
