package com.svir.func;

import com.svir.func.Bound;
import java.lang.Math;

public class Interval implements Comparable<Interval>  {
	
	private Bound left;
	private Bound right;
	
	public boolean isPointBelongs(double x) {
		if (left.getVal() < x && right.getVal() > x) {
			return true;
		}
		if (left.getVal() == x && !left.isOpen()) {
			return true;
		}
		if (right.getVal() == x && !right.isOpen()) {
			return true;
		}
		return false;
	}

	public Interval(Bound aLeft, Bound aRight) {
		left = aLeft;
		right = aRight;
	}
	
	public Bound getBoundLeft() {
		return left;
	}
	
	public Bound getBoundRight() {
		return right;
	}
	
	private static <T> int sign(T numeric) {
		return (int)Math.signum((float)numeric);
	}
	
	@Override
	public int compareTo(Interval aInterval) {
		// Value                     0    0    1   -1   -1     1 
		// this, left bound      ----O----*----O----*----*------*
		// aInterval, left bound ----O----*----*----O-----*----*
		
		double a = left.getVal();
		double b = aInterval.getBoundLeft().getVal();
		int aIsOpen = left.isOpen() ? 1 : 0;
		int bIsOpen = aInterval.getBoundLeft().isOpen() ? 1 : 0;
		int aEqB = (a == b) ? 1 : 0;
		
		return sign(a - b) + aEqB * (aIsOpen - bIsOpen);
	}
	
}
