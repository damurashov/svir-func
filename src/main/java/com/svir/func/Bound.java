package com.svir.func;


public class Bound {

	private double val;
	private boolean open;

	public double getVal() {
		return val;
	}

	public boolean isOpen() {
		return open;
	}

	Bound(float aVal, boolean aOpen) {
		val = aVal;
		open = aOpen;
	}
}
