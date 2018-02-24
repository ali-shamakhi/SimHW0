class Calculate_PI_Sim extends IntegralProblemSim {

    Calculate_PI_Sim() {
        super();    // init rnd
        minX = 0.0f;
        maxX = 1.0f;
        minY = 0.0f;
        maxY = 1.0f;
        resultCoefficient = 4.0f;
    }

    @Override
    boolean isContainedPoint(double x, double y) {
        return (y * y <= 1.0f - x * x);
    }
}
