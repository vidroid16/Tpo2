package Thrigonometric;

import andrey.shalya.AbstractFunc;

public class Sin extends AbstractFunc {
    private double eps;

    public Sin(double eps) {
        this.eps = eps;
    }

    public double getEps() {
        return eps;
    }

    private Double CalibrateX(Double x) {
            double del = Math.PI * 2;
            if (x < 0)
                del *= -1;
            while (Math.abs(x) > 30.0) {
                x -= del;
            }
            return x;
        }
        @Override
        public double getF(double x) {
            x = CalibrateX(x);
            Double xn = x;
            Double prevSum = 0.0;
            Double sum = x;
            final double INF = 1.0e8;


            for (Integer n = 1; Math.abs(Math.abs(sum) - Math.abs(prevSum)) > eps; n++) {
                prevSum = sum;
                xn *= (-x*x)/((2*n+1)*2*n);
                sum += xn;
            }
            return Math.abs(sum) > INF ? INF : sum;
        }
}
