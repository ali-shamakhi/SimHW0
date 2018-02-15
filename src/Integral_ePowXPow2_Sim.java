class Integral_ePowXPow2_Sim extends IntegralGivenRectSim {

    Integral_ePowXPow2_Sim(float minX, float maxX, float minY, float maxY) {
        super(minX, maxX, minY, maxY);
        resultCoefficient = 1.0f;
    }

    @Override
    boolean isContainedPoint(float x, float y) {
        return (y <= Math.pow(Math.E, x * x));
    }
}
