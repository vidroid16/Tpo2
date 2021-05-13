package Thrigonometric;

import andrey.shalya.AbstractFunc;

public class SystemThrigon extends AbstractFunc {
    Sin sin;
    Cos cos;
    Cot cot;
    Sec sec;
    Csc csc;

    public SystemThrigon(Sin sin) {
        this.sin = sin;
        cos = new Cos(sin);
        sec = new Sec(sin);
        cot = new Cot(sin);
        csc = new Csc(sin);
    }

    @Override
    public double getF(double x){
        return (((Math.pow(Math.pow(Math.pow(Math.pow(cot.getF(x),2) / cot.getF(x), 3),3),3) + (sec.getF(x) * ((cot.getF(x) + sec.getF(x)) + cos.getF(x)))) / ((csc.getF(x) - cos.getF(x)) + cot.getF(x))));
    }
}
