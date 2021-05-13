package Logarithm.LStubs;

import andrey.shalya.AbstractFunc;

import java.util.HashMap;

import static java.lang.Double.NaN;
import static java.lang.Double.POSITIVE_INFINITY;

public class LinLogStubs extends AbstractFunc {
    private HashMap<Double,Double> linLogStubs = new HashMap<>();
    public LinLogStubs(){
        linLogStubs.put(POSITIVE_INFINITY, POSITIVE_INFINITY);
        linLogStubs.put(Math.PI, 1.1447298858494002);
        linLogStubs.put(Math.PI/2, 0.4515827);
        linLogStubs.put(Math.E - 0.01, 0.996314422);
        linLogStubs.put(1.4, 0.336472);
        linLogStubs.put(Math.E, 1.0);
        linLogStubs.put(Math.E + 0.01, 1.003672044);
        linLogStubs.put(0.0 - 0.01, NaN);
        linLogStubs.put(0.0, Double.NEGATIVE_INFINITY);
        linLogStubs.put(0.0 + 0.01, -4.597299250490899);
        linLogStubs.put(1.0 - 0.01, -0.010050000000000009);
        linLogStubs.put(1.0, 0.0);
        linLogStubs.put(1.0 + 0.01, 0.00995000000000001);
        linLogStubs.put(2.0, 0.693147180559);
        linLogStubs.put(3.0, 1.098612288);
        linLogStubs.put(5.0, 1.60943791243);
        linLogStubs.put(10.0, 2.302585092994);
    }

    @Override
    public double getF(double x) {
        return linLogStubs.get(x);
    }
}
