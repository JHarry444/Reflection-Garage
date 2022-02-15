package com.qa.garage;

public class Runner {

	public static void main(String[] args) throws Exception {
		try {
			Garage garage = new Garage();

			GarageMenu menu = new GarageMenu(garage);
			menu.start();

		} finally {
			Utils.close();
		}
	}

}
