package com.qa.garage;

import java.util.Scanner;

public class Utils {

	private static final Scanner scan = new Scanner(System.in);

	public static String getString() {
		String input = null;

		do {
			input = scan.nextLine();
		} while (input == null || input.isBlank());

		return input.trim();
	}

	public static Integer getInteger() {
		Integer input = null;

		do {
			try {
				input = Integer.parseInt(getString());
			} catch (NumberFormatException nfe) {
				System.out.println("Please enter a valid integer");
			}
		} while (input == null);

		return input;
	}

	public static Boolean getBoolean() {
		Boolean input = null;

		do {
			input = Boolean.parseBoolean(getString());
		} while (input == null);

		return input;
	}

	public static void close() {
		scan.close();
	}
}
