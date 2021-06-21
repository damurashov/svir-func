package com.svir.func;

import com.svir.func.IFunction;
import java.util.*;
import java.util.stream.*;


public class PiecewiseFunction implements IFunction {
        
    private List<IFunction> function;
	
	private void sort() {
	}
	
	@Override
	public double evaluate(double x) {
		return -1;
	}
	
	@Override
	public Interval getInterval() {
		return null;
	}
	
	public IFunction getFunction(int pos) {
		return null;
	}
	
	public void addFunction(IFunction aFunction) {
	}
	
}
