package Logarithm.LStubs;

import Logarithm.LinLog;
import Logarithm.Log10;
import Logarithm.Log3;
import Logarithm.Log5;

public class SystemLogStubTwo {
    Log3 log3;
    Log5 log5;
    Log10 log10;
    LinLogStubs linLog;
    LinLog linLogEps;

    public SystemLogStubTwo(double eps) {
        this.linLogEps = new LinLog(eps);
        this.log3 = new Log3(linLogEps);
        this.log5 = new Log5(linLogEps);
        this.log10 = new Log10(linLogEps);
        this.linLog = new LinLogStubs();
    }

    public double getF(double x){
        return (Math.pow((((log3.getFuncFromStub(x) - log3.getFuncFromStub(x)) / (log10.getFuncFromStub(x) + linLog.getF(x))) / log5.getFuncFromStub(x)) * Math.pow(log3.getFuncFromStub(x), 3),2));
    }
}
