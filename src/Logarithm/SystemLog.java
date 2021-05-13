package Logarithm;

import andrey.shalya.AbstractFunc;

public class SystemLog extends AbstractFunc {
    Log3 log3;
    Log5 log5;
    Log10 log10;
    LinLog linLog;

    public SystemLog(LinLog linLog) {
        this.linLog = linLog;
        this.log3 = new Log3(linLog);
        this.log5 = new Log5(linLog);
        this.log10 = new Log10(linLog);
    }

    @Override
    public double getF(double x){
        return (Math.pow((((log3.getF(x) - log3.getF(x)) / (log10.getF(x) + linLog.getF(x))) / log5.getF(x)) * Math.pow(log3.getF(x), 3),2));
    }
}
