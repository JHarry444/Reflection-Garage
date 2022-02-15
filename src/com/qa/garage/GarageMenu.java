package com.qa.garage;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class GarageMenu {

	private Garage garage;

	public GarageMenu(Garage garage) {
		super();
		this.garage = garage;
	}

	private Map<String, Method> getSetters(Class<?> clazz) throws Exception {
		Map<String, Method> setters = new HashMap<>();
		Method[] methods = clazz.getMethods();
		for (Method method : methods) {
			if (method.getName().startsWith("set")) {
				String name = method.getName().replace("set", "");
				setters.putIfAbsent(name, method);
			}
		}
		return setters;
	}

	public void start() {
		System.out.println("Welcome to the garage!");
		String option = null;

		do {
			printOptions();
			option = Utils.getString();
			switch (option.toLowerCase()) {
			case "1":
				this.makeVehicle();
				break;
			case "2":
				this.garage.print();
				break;
			case "q":
			case "quit":
				System.out.println("Bye!");
				return;
			default:
				System.out.println("INVALID OPTION");
			}

		} while (!option.equalsIgnoreCase("q") && !option.equalsIgnoreCase("quit"));
	}

	private void printOptions() {
		System.out.println("Please select an option:");
		System.out.println("1) Make vehicle");
		System.out.println("2) Print");
		System.out.println("q) Quit");
	}

	private void makeVehicle() {
		System.out.println("What type of vehicle would you like to make?");
		String vehicleType = Utils.getString();
		vehicleType = vehicleType.substring(0, 1).toUpperCase() + vehicleType.substring(1);
		try {
			Class<?> clazz = Class.forName("com.qa.garage." + vehicleType);
			Object obj = clazz.getConstructor().newInstance();
			if (!(obj instanceof Vehicle)) {
				System.out.println("Invalid Vehicle Type: " + vehicleType);
				return;
			}
			for (Entry<String, Method> entry : this.getSetters(clazz).entrySet()) {
				System.out.println("Please enter a " + entry.getKey() + ":");
				Method setter = entry.getValue();
				Class<?> parameterType = setter.getParameterTypes()[0];
				if (parameterType == int.class) {
					setter.invoke(obj, Utils.getInteger());
				} else if (parameterType == String.class) {
					setter.invoke(obj, Utils.getString());
				} else if (parameterType == Boolean.class) {
					setter.invoke(obj, Utils.getBoolean());
				}
			}
			this.garage.addVehicle((Vehicle) obj);
		} catch (InstantiationException e) {
			System.out.println("ERROR: "
					+ "Unable to create a vehicle of that type - please unsure you only try to instantiate concrete classes");
		} catch (NoSuchMethodException e) {
			System.out.println("ERROR: " + "Missing default constructor");
		} catch (ClassNotFoundException e) {
			System.out.println("ERROR: " + "No vehicle of that type");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
