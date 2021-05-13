package Logarithm.LStubs;

import andrey.shalya.AbstractFunc;

import java.util.HashMap;

import static java.lang.Double.*;

public class Log10Stubs extends AbstractFunc {
    private HashMap<Double,Double> log10Stubs = new HashMap<>();

    Log10Stubs(){
        log10Stubs.put(POSITIVE_INFINITY, POSITIVE_INFINITY);
        log10Stubs.put(10.0 - 0.01, 0.999565);
        log10Stubs.put(10.0, 1.0);
        log10Stubs.put(10.0 + 0.01, 1.00043);
        log10Stubs.put(1.5707963267948966,0.19611987);
        log10Stubs.put(1.4,0.146128);
        log10Stubs.put(0.0 - 0.01, NaN);
        log10Stubs.put(0.0, NEGATIVE_INFINITY);
        log10Stubs.put(0.0 + 0.01, -1.9966406951372424);
        log10Stubs.put(1.0 - 0.01, -0.00436481);
        log10Stubs.put(1.0, 0.0);
        log10Stubs.put(1.0 + 0.01, 0.00432137);
    }

    @Override
    public double getF(double x) {
        return log10Stubs.get(x);
    }
}
