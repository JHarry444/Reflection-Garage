package com.qa.paint;

public class App {

	public static void main(String[] args) throws Exception {
		Paint cheapo = new Paint("Cheapo Max", 21, 19.99F, 10);
		Paint dog = new Paint("That One With The Dog", 40, 34.38F, 12);
		Paint avg = new Paint("Average Joes", 16, 17.99F, 11);
		Paint dul = new Paint("Duluxourous Paints", 10, 25, 22);

		PaintWizard wizard = new PaintWizard(cheapo, dog, avg, dul);

		System.out.println(wizard.cheapest(10));
		System.out.println(wizard.cheapest(100));
		System.out.println(wizard.cheapest(1_000));
		System.out.println(wizard.cheapest(10_000));
	}

}
