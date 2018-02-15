class Integral_xPow2_Sim extends IntegralGivenRectSim {

    Integral_xPow2_Sim(float minX, float maxX, float minY, float maxY) {
        super(minX, maxX, minY, maxY);
        resultCoefficient = 1.0f;
    }

    @Override
    boolean isContainedPoint(float x, float y) {
        return (y <= x * x);
    }
}
