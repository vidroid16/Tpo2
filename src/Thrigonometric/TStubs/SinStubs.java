package Thrigonometric.TStubs;

import andrey.shalya.AbstractFunc;

import java.util.HashMap;

public class SinStubs extends AbstractFunc {
    private HashMap<Double,Double> sinStubs = new HashMap<>();
    public SinStubs(){
        sinStubs.put(-Math.PI, 0.0);
        sinStubs.put(-3 * Math.PI / 4, -0.707106781);
        sinStubs.put(-Math.PI / 2, -1.0);
        sinStubs.put(-Math.PI / 4, -0.707106781);
        sinStubs.put(0.0, 0.0);
        sinStubs.put(Math.PI / 4, 0.707106781);
        sinStubs.put(Math.PI / 2, 1.0);
        sinStubs.put(3 * Math.PI / 4, 0.707106781);
        sinStubs.put(Math.PI, 0.0);
    }

    @Override
    public double getF(double x) {
        return sinStubs.get(x);
    }
}
