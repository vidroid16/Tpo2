package Thrigonometric.TStubs;

import andrey.shalya.AbstractFunc;

import java.util.HashMap;

public class CosStubs extends AbstractFunc {
    private HashMap<Double,Double> cosStubs = new HashMap<>();
    public CosStubs(){
        cosStubs.put(-Math.PI, -1.0);
        cosStubs.put(-3 * Math.PI / 4, -0.707106781);
        cosStubs.put(-Math.PI / 2, 0.0);
        cosStubs.put(-Math.PI / 4, 0.707106781);
        cosStubs.put(0.0, 1.0);
        cosStubs.put(Math.PI / 4, 0.707106781);
        cosStubs.put(Math.PI / 2, 0.0);
        cosStubs.put(3 * Math.PI / 4, -0.707106781);
        cosStubs.put(Math.PI, -1.0);
    }

    @Override
    public double getF(double x) {
        return cosStubs.get(x);
    }
}
