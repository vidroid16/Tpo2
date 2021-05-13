package Logarithm.LStubs;

import andrey.shalya.AbstractFunc;

import java.util.HashMap;

import static java.lang.Double.*;

public class Log5Stubs extends AbstractFunc {
    private HashMap<Double,Double> log5Stubs = new HashMap<>();

    Log5Stubs(){
        log5Stubs.put(POSITIVE_INFINITY, POSITIVE_INFINITY);
        log5Stubs.put(5.0 - 0.01, 0.998756);
        log5Stubs.put(5.0, 1.0);
        log5Stubs.put(5.0 + 0.01, 1.00124);
        log5Stubs.put(1.5707963267948966,0.28058411);
        log5Stubs.put(1.4,0.209062);
        log5Stubs.put(0.0 - 0.01, NaN);
        log5Stubs.put(0.0, NEGATIVE_INFINITY);
        log5Stubs.put(0.0 + 0.01, -2.861353);
        log5Stubs.put(1.0 - 0.01, -0.00624462);
        log5Stubs.put(1.0, 0.0);
        log5Stubs.put(1.0 + 0.01, 0.00618249);
    }

    @Override
    public double getF(double x) {
        return log5Stubs.get(x);
    }
}
