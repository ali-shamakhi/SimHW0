abstract class IntegralGivenRectSim extends IntegralProblemSim {

    IntegralGivenRectSim(double minX, double maxX, double minY, double maxY) {
        super();    // init rnd
        this.minX = minX;
        this.maxX = maxX;
        this.minY = minY;
        this.maxY = maxY;
        resultCoefficient = 1.0f;
    }

}
