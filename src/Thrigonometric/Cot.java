package Thrigonometric;

import andrey.shalya.AbstractFunc;

public class Cot extends AbstractFunc {
    private Sin sin;
    private double eps;
    private Cos cos;
    public Cot(Sin sin) {
        this.sin = sin;
        eps = sin.getEps();
        cos = new Cos(sin);
    }

    @Override
    public double getF(double x) {
        return Math.abs(sin.getF(x)) < eps ? Double.NaN : cos.getF(x) / sin.getF(x);
    }

    public double getFuncFromStub(double sinx, double cosx){
        return Math.abs(sinx) < eps ? Double.NaN : cosx / sinx;
    }

}
