package Logarithm.LStubs;

import Logarithm.LinLog;
import Logarithm.Log10;
import Logarithm.Log3;
import Logarithm.Log5;

public class SystemLogStubOne {
    Log3Stubs log3;
    Log5Stubs log5;
    Log10Stubs log10;
    LinLogStubs linLog;

    public SystemLogStubOne() {
        this.linLog = new LinLogStubs();
        this.log3 = new Log3Stubs();
        this.log5 = new Log5Stubs();
        this.log10 = new Log10Stubs();
    }

    public double getF(double x){
        return (Math.pow((((log3.getF(x) - log3.getF(x)) / (log10.getF(x) + linLog.getF(x))) / log5.getF(x)) * Math.pow(log3.getF(x), 3),2));
    }
}
