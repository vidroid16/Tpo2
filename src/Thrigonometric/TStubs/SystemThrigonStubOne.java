package Thrigonometric.TStubs;

import Thrigonometric.*;

public class SystemThrigonStubOne {
    SinStubs sin;
    CosStubs cos;
    CotStubs cot;
    SecStubs sec;
    CscStubs csc;

    public SystemThrigonStubOne() {
        sin = new SinStubs();
        cos = new CosStubs();
        sec = new SecStubs();
        cot = new CotStubs();
        csc = new CscStubs();
    }
    public double getF(double x){
        return (((Math.pow(Math.pow(Math.pow(Math.pow(cot.getF(x),2) / cot.getF(x), 3),3),3) + (sec.getF(x) * ((cot.getF(x) + sec.getF(x)) + cos.getF(x)))) / ((csc.getF(x) - cos.getF(x)) + cot.getF(x))));
    }
}
