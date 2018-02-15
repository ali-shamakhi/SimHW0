import java.util.Random;

abstract class IntegralProblemSim {

    // TODO: Inspect pros and cons of using double types (precession vs speed).
    float minX;  // a
    float maxX;  // b
    float minY;
    float maxY;
    float resultCoefficient;
    private float testRectangleArea = 0.0f;
    private boolean setTestRectangleArea = false;
    private long countAllPoints = 0L;        // N
    private long countContainedPoints = 0L;  // M
    private final Random rnd;

    private float getTestRectangleArea() {
        if (!setTestRectangleArea) {
            testRectangleArea = (maxY - minY) * (maxX - minX);
            setTestRectangleArea = true;
        }
        return testRectangleArea;
    }

    private float getRandIn(float min, float max) {
        return min + rnd.nextFloat() * (max - min);
    }

    abstract boolean isContainedPoint(float x, float y);

    IntegralProblemSim() {
        rnd = new Random(System.currentTimeMillis());   // init rnd
    }

    public void generateNextPoint() {
        float x = getRandIn(minX, maxX);
        float y = getRandIn(minY, maxY);
        countAllPoints++;
        if (isContainedPoint(x, y)) countContainedPoints++;
    }

    public float getResult() {
        return resultCoefficient * getTestRectangleArea() * countContainedPoints / countAllPoints;
    }

    public long getCountAllPoints() {
        return countAllPoints;
    }
}
