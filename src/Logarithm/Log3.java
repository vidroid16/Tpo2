package Logarithm;

import Logarithm.LStubs.LinLogStubs;
import andrey.shalya.AbstractFunc;

public class Log3 extends AbstractFunc {
    static LinLog ln;
    LinLogStubs linLogStubs = new LinLogStubs();

    public Log3(LinLog ln) {
        this.ln = ln;
    }

    @Override
    public double getF(double x){
        double res = ln.getF(3)/ln.getF(x);
        return res;
    }
    public double getFuncFromStub( double x){
        return linLogStubs.getF(x)/ linLogStubs.getF(3.0);
    }
}
