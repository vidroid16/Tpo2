package Logarithm.LStubs;

import andrey.shalya.AbstractFunc;

import java.util.HashMap;

import static java.lang.Double.*;

public class Log3Stubs extends AbstractFunc {
    private HashMap<Double,Double> log3Stubs = new HashMap<>();

    Log3Stubs(){
        log3Stubs.put(POSITIVE_INFINITY, POSITIVE_INFINITY);
        log3Stubs.put(3.0 - 0.01, 0.996961);
        log3Stubs.put(3.0, 1.0);
        log3Stubs.put(3.0 + 0.01, 1.00303);
        log3Stubs.put(1.5707963267948966,0.41104829);
        log3Stubs.put(1.4,0.306270);
        log3Stubs.put(0.0 - 0.01, NaN);
        log3Stubs.put(0.0, NEGATIVE_INFINITY);
        log3Stubs.put(0.0 + 0.01, -4.191807);
        log3Stubs.put(1.0 - 0.01, -0.00914821);
        log3Stubs.put(1.0, 0.0);
        log3Stubs.put(1.0 + 0.01, 0.00905718);
    }

    @Override
    public double getF(double x) {
        return log3Stubs.get(x);
    }
}
