package Thrigonometric.TStubs;

import andrey.shalya.AbstractFunc;

import java.util.HashMap;

public class CotStubs extends AbstractFunc {
    private HashMap<Double,Double> cotStubs = new HashMap<>();
    public CotStubs(){
        cotStubs.put(-Math.PI, Double.POSITIVE_INFINITY);
        cotStubs.put(-3 * Math.PI / 4, 1.0);
        cotStubs.put(-Math.PI / 2, 0.0);
        cotStubs.put(-Math.PI / 4, -1.0);
        cotStubs.put(0.0, Double.POSITIVE_INFINITY);
        cotStubs.put(Math.PI / 4, 1.0);
        cotStubs.put(Math.PI / 2, 0.0);
        cotStubs.put(3 * Math.PI / 4, -1.0);
        cotStubs.put(Math.PI, -Double.POSITIVE_INFINITY);
    }

    @Override
    public double getF(double x) {
        return cotStubs.get(x);
    }
}
