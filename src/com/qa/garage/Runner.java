package com.qa.garage;

public class Runner {

	public static void main(String[] args) {
		Garage garage = new Garage();

		garage.addVehicle(new Car(20, 4, 5));
		garage.addVehicle(new Bike(5, 2, false));
		garage.addVehicle(new Bike(5, 2, false));
		garage.addVehicle(new Plane(40, 3, true));

		Car c = new Car(0, 0, 0);
		System.out.println(c.getClass().getSimpleName());

		garage.print();

		System.out.println(garage.calcBill());
		System.out.println(garage.calcBillUpgraded());

		garage.removeVehicle(Bike.class);

		garage.print();

		garage.removeVehicle(Car.class);

		System.out.println(c instanceof Car);
		System.out.println(c.getClass() == Car.class);
		System.out.println(Car.class);
	}

}
