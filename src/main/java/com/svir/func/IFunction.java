package com.svir.func;

import javafx.util.Pair;

public interface IFunction {

    /**
     * Represents a bound of a mathematical interval abstraction: (VALUE, OPEN/CLOSED)
     */
    static class Bound {
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

    /**
     * The Interval of the function
     * @return  Pair<LEFT BOUND, RIGHT BOUND>
     */
    public Pair<Bound, Bound> getInterval();

    /**
     * Calculates value in the point "x"
     * @param x  -  the point
     * @return  -  {double, Nan, +-Inf}; returns NaN if unable to compute, or "x" exceeds the interval
     */
    public double evaluate(double x);
}
