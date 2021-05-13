package andrey.shalya;

import Logarithm.LinLog;
import Logarithm.SystemLog;
import Thrigonometric.Sin;
import Thrigonometric.SystemThrigon;

public class MySystem extends AbstractFunc{
    SystemLog systemLog;
    SystemThrigon systemThrigon;

    public MySystem(double eps){
        LinLog linLog = new LinLog(eps);
        systemLog = new SystemLog(linLog);
        Sin sin = new Sin(eps);
        systemThrigon = new SystemThrigon(sin);
    }

    @Override
    public double getF(double x) {
        if(x<=0){
            return systemThrigon.getF(x);
        }else {
            return systemLog.getF(x);
        }
    }
}
