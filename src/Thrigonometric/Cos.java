package Thrigonometric;

import andrey.shalya.AbstractFunc;

public class Cos extends AbstractFunc {
    private Sin sin;
    private double eps;

    public Cos(Sin sin) {
        this.sin = sin;
        eps = sin.getEps();
    }

    @Override
    public double getF(double x) {
        return ((Math.abs(x / Math.PI) - (double) ((int) Math.abs(x / Math.PI))) < 1e-6) ? 1 : sin.getF(2 * x) / (2 * sin.getF(x));
    }
}
