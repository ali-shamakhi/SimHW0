class Integral_ePowXPow2_Sim extends IntegralGivenRectSim {

    Integral_ePowXPow2_Sim(double minX, double maxX, double minY, double maxY) {
        super(minX, maxX, minY, maxY);
        resultCoefficient = 1.0f;
    }

    @Override
    boolean isContainedPoint(double x, double y) {
        return (y <= Math.pow(Math.E, x * x));
    }
}
