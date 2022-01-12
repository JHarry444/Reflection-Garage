package com.qa.garage;

import java.util.ArrayList;
import java.util.List;

public class Garage {

	private List<Vehicle> vehicles = new ArrayList<>();

	private int currentId;

	public Garage() {
		super();
	}

	public void addVehicle(Vehicle v) {
		v.setId(++currentId);
		this.vehicles.add(v);
	}

	public float calcBillUpgraded() {
		float bill = 0.0f;
		for (Vehicle v : this.vehicles) {
			bill += v.calcBill();
		}
		return bill;
	}

	public float calcBill() {
		float bill = 0.0f;

		for (Vehicle v : this.vehicles) {
			if (v instanceof Car) {
				Car c = (Car) v;
				bill += c.getNoOfWheels() * 50 + c.getWeight() * 2 + c.getBootSize() * 20;
			} else if (v instanceof Bike) {
				Bike b = (Bike) v;
				bill += b.getNoOfWheels() * 50 + b.getWeight() * 2;
				if (b.isHasSideCar()) {
					bill *= 20;
				}
			} else if (v instanceof Plane) {
				Plane p = (Plane) v;
				bill += p.getNoOfWheels() * 50 + p.getWeight() * 2;
				if (p.isPropellor()) {
					bill /= 2;
				}
			}
		}
		return bill;
	}

	public void clear() {
		this.vehicles.clear();
	}

	public void removeVehicle(int id) {
		for (Vehicle v : this.vehicles) {
			if (v.getId() == id) {
				this.vehicles.remove(v);
				return;
			}
		}
	}

	public void removeVehicle(String type) {
		List<Vehicle> toRemove = new ArrayList<>();
		for (Vehicle v : this.vehicles) {
			if (v.getClass().getSimpleName().equals(type)) {
				toRemove.add(v);
			}
		}
		this.vehicles.removeAll(toRemove);
	}

	public void removeVehicle(Class<?> clazz) {
		for (Vehicle v : new ArrayList<>(this.vehicles)) {
			if (v.getClass() == clazz) {
				this.vehicles.remove(v);
			}
		}
	}

	public void print() {
		System.out.println(this.vehicles);
	}

}
