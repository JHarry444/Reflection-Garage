package com.qa.paint;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PaintWizard {

	private List<Paint> paints = new ArrayList<>();

	public PaintWizard(Paint... paints) {
		this.paints.addAll(Arrays.asList(paints));
	}

	public Paint cheapest(int roomSize) {
		Float lowestPrice = null;
		Paint cheapest = null;

		for (Paint p : this.paints) {
			float price = p.calcPrice(roomSize);
			if (lowestPrice == null || price < lowestPrice) {
				lowestPrice = price;
				cheapest = p;
			}
		}

		return cheapest;
	}

}
