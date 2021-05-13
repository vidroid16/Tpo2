package Thrigonometric.TStubs;

import andrey.shalya.AbstractFunc;

import java.util.HashMap;

public class CscStubs extends AbstractFunc {
    private HashMap<Double,Double> cscStubs = new HashMap<>();
    public CscStubs(){
        cscStubs.put(-Math.PI, Double.POSITIVE_INFINITY);
        cscStubs.put(-3 * Math.PI / 4, -1.41421);
        cscStubs.put(-Math.PI / 2, -1.0);
        cscStubs.put(-Math.PI / 4, -1.41421);
        cscStubs.put(0.0, Double.POSITIVE_INFINITY);
        cscStubs.put(Math.PI / 4, 1.41421);
        cscStubs.put(Math.PI / 2, 1.0);
        cscStubs.put(3 * Math.PI / 4, 1.41421);
        cscStubs.put(Math.PI, Double.POSITIVE_INFINITY);
    }

    @Override
    public double getF(double x) {
        return cscStubs.get(x);
    }
}
