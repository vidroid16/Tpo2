package Thrigonometric.TStubs;

import andrey.shalya.AbstractFunc;

import java.util.HashMap;

public class SecStubs extends AbstractFunc {
    private HashMap<Double,Double> secStubs = new HashMap<>();
    public SecStubs(){
        secStubs.put(-Math.PI, -1.0);
        secStubs.put(-3 * Math.PI / 4, -1.41421);
        secStubs.put(-Math.PI / 2, Double.POSITIVE_INFINITY);
        secStubs.put(-Math.PI / 4, 1.41421);
        secStubs.put(0.0, 1.0);
        secStubs.put(Math.PI / 4, 1.41421);
        secStubs.put(Math.PI / 2, Double.POSITIVE_INFINITY);
        secStubs.put(3 * Math.PI / 4, -1.41421);
        secStubs.put(Math.PI, -1.0);
    }

    @Override
    public double getF(double x) {
        return secStubs.get(x);
    }
}
