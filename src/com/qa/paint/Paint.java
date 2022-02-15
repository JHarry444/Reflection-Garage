package com.qa.paint;

public class Paint {

	private String name;

	private int volume;

	private float price;

	private int coverage;

	public Paint() {
		super();
	}

	public Paint(String name, int volume, float price, int coverage) {
		super();
		this.name = name;
		this.volume = volume;
		this.price = price;
		this.coverage = coverage;
	}

	public float calcPrice(int roomSize) {
		int currentCoverage = 0;
		float currentPrice = 0.0f;

		while (currentCoverage < roomSize) {
			currentCoverage += volume * coverage;
			currentPrice += this.price;
		}

		return currentPrice;
	}

	@Override
	public String toString() {
		return "Paint [name=" + this.name + ", volume=" + this.volume + ", price=" + this.price + ", coverage="
				+ this.coverage + "]";
	}

}
