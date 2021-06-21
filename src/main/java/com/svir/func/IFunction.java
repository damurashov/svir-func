package com.svir.func;

import com.svir.func.Bound;
import com.svir.func.Interval;

public interface IFunction {

	public Interval getInterval();

	public double evaluate(double x);
}

