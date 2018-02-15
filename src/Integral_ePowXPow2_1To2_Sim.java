class Integral_ePowXPow2_1To2_Sim extends IntegralProblemSim {

    Integral_ePowXPow2_1To2_Sim() {
        super();    // init rnd
        minX = 1.0f;
        maxX = 2.0f;
        minY = 0.0f;
        maxY = (float)(Math.pow(Math.E, 4.0));
        resultCoefficient = 1.0f;
    }

    @Override
    boolean isContainedPoint(float x, float y) {
        return (y <= Math.pow(Math.E, x * x));
    }
}
