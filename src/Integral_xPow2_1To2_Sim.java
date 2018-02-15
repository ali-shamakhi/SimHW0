class Integral_xPow2_1To2_Sim extends IntegralProblemSim {

    Integral_xPow2_1To2_Sim() {
        super();    // init rnd
        minX = 1.0f;
        maxX = 2.0f;
        minY = 0.0f;
        maxY = 4.0f;
        resultCoefficient = 1.0f;
    }

    @Override
    boolean isContainedPoint(float x, float y) {
        return (y <= x * x);
    }
}
