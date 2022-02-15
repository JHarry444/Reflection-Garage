package com.qa.garage;

import java.lang.reflect.Method;

public class GetterSetter {

	private Method getter;

	private Method setter;

	public GetterSetter() {
	}

	public GetterSetter(Method getter, Method setter) {
		super();
		this.getter = getter;
		this.setter = setter;
	}

	public Method getGetter() {
		return this.getter;
	}

	public void setGetter(Method getter) {
		this.getter = getter;
	}

	public Method getSetter() {
		return this.setter;
	}

	public void setSetter(Method setter) {
		this.setter = setter;
	}

	@Override
	public String toString() {
		return "GetterSetter [getter=" + this.getter + ", setter=" + this.setter + "]";
	}

}
