package Thrigonometric;

import andrey.shalya.AbstractFunc;

public class Sec extends AbstractFunc {
    private Sin sin;
    private double eps;
    private Cos cos;
    public Sec(Sin sin) {
        this.sin = sin;
        eps = sin.getEps();
        cos = new Cos(sin);
    }

    @Override
    public double getF(double x) {
        return Math.abs(cos.getF(x)) < eps ? Double.NaN : 1 / cos.getF(x);
    }

    public double getFuncFromStub(double cosx){
        return Math.abs(cosx) < eps ? Double.NaN : 1 / cosx;
    }
}
