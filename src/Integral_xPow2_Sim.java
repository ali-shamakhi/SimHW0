class Integral_xPow2_Sim extends IntegralGivenRectSim {

    Integral_xPow2_Sim(double minX, double maxX, double minY, double maxY) {
        super(minX, maxX, minY, maxY);
        resultCoefficient = 1.0f;
    }

    @Override
    boolean isContainedPoint(double x, double y) {
        return (y <= x * x);
    }
}
