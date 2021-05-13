package andrey.shalya;

import Logarithm.LinLog;
import Logarithm.SystemLog;
import Thrigonometric.Sin;
import Thrigonometric.SystemThrigon;
import Thrigonometric.TFuncs;

public class Main {
    public static void main(String[] args) {
        LinLog ln = new LinLog(0.001);

        Sin sin = new Sin(0.000000000000001);
        TFuncs tFuncs = new TFuncs(sin);
        Double res = tFuncs.cos(3.1414);
        SystemThrigon thrigon = new SystemThrigon(sin);
    }
}
