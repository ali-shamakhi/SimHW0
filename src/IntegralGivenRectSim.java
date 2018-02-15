abstract class IntegralGivenRectSim extends IntegralProblemSim {

    IntegralGivenRectSim(float minX, float maxX, float minY, float maxY) {
        super();    // init rnd
        this.minX = minX;
        this.maxX = maxX;
        this.minY = minY;
        this.maxY = maxY;
        resultCoefficient = 1.0f;
    }

}
