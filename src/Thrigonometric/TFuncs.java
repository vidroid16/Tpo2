package Thrigonometric;

public class TFuncs {
    private Sin sin;
    private double eps;

    public TFuncs(Sin sin) {
        this.sin = sin;
       double eps = sin.getEps();
    }

    public Double sin(Double x) {
        return sin.getF(x);
    }

    public Double cos(Double x) {
        return ((Math.abs(x / Math.PI) - (double) ((int) Math.abs(x / Math.PI))) < 1e-6) ? 1 : sin(2 * x) / (2 * sin(x));
    }

    public Double tan(Double x) {
        return Math.abs(cos(x)) < eps ? Double.NaN : sin(x) / cos(x);
    }

    public Double cot(Double x) {
        return Math.abs(sin(x)) < eps ? Double.NaN : cos(x) / sin(x);
    }

    public Double sec(Double x) {
        return Math.abs(cos(x)) < eps ? Double.NaN : 1 / cos(x);
    }
    public Double csc(Double x) {
        return Math.abs(cos(x)) < eps ? Double.NaN : 1 / sin(x);
    }
}
