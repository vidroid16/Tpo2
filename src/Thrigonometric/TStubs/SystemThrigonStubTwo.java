package Thrigonometric.TStubs;

import Thrigonometric.Cot;
import Thrigonometric.Csc;
import Thrigonometric.Sec;
import Thrigonometric.Sin;

public class SystemThrigonStubTwo {
    SinStubs sin;
    CosStubs cos;
    Cot cot;
    Sec sec;
    Csc csc;

    public SystemThrigonStubTwo(double eps) {
        Sin sinAcc = new Sin(eps);
        sin = new SinStubs();
        cos = new CosStubs();
        sec = new Sec(sinAcc);
        cot = new Cot(sinAcc);
        csc = new Csc(sinAcc);
    }
    public double getF(double x){
        double sinx = sin.getF(x);
        double cosx = cos.getF(x);
        System.out.println("sin = "+sinx);
        System.out.println("cos = "+cosx);
        return (((Math.pow(Math.pow(Math.pow(Math.pow(cot.getFuncFromStub(sinx,cosx),2) / cot.getFuncFromStub(sinx,cosx), 3),3),3) + (sec.getFuncFromStub(cosx) * ((cot.getFuncFromStub(sinx,cosx) + sec.getFuncFromStub(cosx)) + cos.getF(x)))) / ((csc.getFuncFromStub(sinx,cosx) - cos.getF(x)) + cot.getFuncFromStub(sinx,cosx))));
    }
}
