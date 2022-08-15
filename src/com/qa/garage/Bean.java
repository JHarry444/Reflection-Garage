package com.qa.garage;

import java.io.Serializable;

public class Bean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1605817848807333966L;

	private int a, b, c;

	public Bean() {
		super();
	}

	public int getA() {
		return this.a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return this.b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getC() {
		return this.c;
	}

	public void setC(int c) {
		this.c = c;
	}

}
