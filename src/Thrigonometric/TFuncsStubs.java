package Thrigonometric;

import java.util.HashMap;

public class TFuncsStubs {
    private HashMap<Double,Double> cosStubs = new HashMap<>();
    private HashMap<Double,Double> sinStubs = new HashMap<>();
    private HashMap<Double,Double> tanStubs = new HashMap<>();
    private HashMap<Double,Double> cotStubs = new HashMap<>();
    private HashMap<Double,Double> secStubs = new HashMap<>();
    private HashMap<Double,Double> cscStubs = new HashMap<>();
    public TFuncsStubs() {


        sinStubs.put(-Math.PI, 0.0);
        sinStubs.put(-3 * Math.PI / 4, -0.707106781);
        sinStubs.put(-Math.PI / 2, -1.0);
        sinStubs.put(-Math.PI / 4, 0.707106781);
        sinStubs.put(0.0, 0.0);
        sinStubs.put(Math.PI / 4, 0.707106781);
        sinStubs.put(Math.PI / 2, 1.0);
        sinStubs.put(3 * Math.PI / 4, 0.707106781);
        sinStubs.put(Math.PI, 0.0);

        cosStubs.put(-Math.PI, -1.0);
        cosStubs.put(-3 * Math.PI / 4, -0.707106781);
        cosStubs.put(-Math.PI / 2, 0.0);
        cosStubs.put(-Math.PI / 4, 0.707106781);
        cosStubs.put(0.0, 1.0);
        cosStubs.put(Math.PI / 4, 0.707106781);
        cosStubs.put(Math.PI / 2, 0.0);
        cosStubs.put(3 * Math.PI / 4, -0.707106781);
        cosStubs.put(Math.PI, -1.0);

        cotStubs.put(-Math.PI, Double.POSITIVE_INFINITY);
        cotStubs.put(-3 * Math.PI / 4, 1.0);
        cotStubs.put(-Math.PI / 2, 0.0);
        cotStubs.put(-Math.PI / 4, -1.0);
        cotStubs.put(0.0, Double.POSITIVE_INFINITY);
        cotStubs.put(Math.PI / 4, 1.0);
        cotStubs.put(Math.PI / 2, 0.0);
        cotStubs.put(3 * Math.PI / 4, -1.0);
        cotStubs.put(Math.PI, -Double.POSITIVE_INFINITY);

        secStubs.put(-Math.PI, -1.0);
        secStubs.put(-3 * Math.PI / 4, -1.41421);
        secStubs.put(-Math.PI / 2, Double.POSITIVE_INFINITY);
        secStubs.put(-Math.PI / 4, 1.41421);
        secStubs.put(0.0, 1.0);
        secStubs.put(Math.PI / 4, 1.41421);
        secStubs.put(Math.PI / 2, Double.POSITIVE_INFINITY);
        secStubs.put(3 * Math.PI / 4, -1.41421);
        secStubs.put(Math.PI, -1.0);

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

    public Double sin(Double x) {
        return sinStubs.get(x);
    }

    public Double cos(Double x) {
        return cosStubs.get(x);
    }

    public Double tan(Double x) {
        return tanStubs.get(x);
    }

    public Double cot(Double x) {
        return cotStubs.get(x);
    }

    public Double sec(Double x) {
        return secStubs.get(x);
    }
    public Double csc(Double x) {
        return cscStubs.get(x);
    }
}
