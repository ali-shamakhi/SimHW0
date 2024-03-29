import java.util.Random;

abstract class IntegralProblemSim {

    double minX;  // a
    double maxX;  // b
    double minY;
    double maxY;
    double resultCoefficient;
    private double testRectangleArea = 0.0f;
    private boolean setTestRectangleArea = false;
    private long countAllPoints = 0L;        // N
    private long countContainedPoints = 0L;  // M
    // <Switch rnd>
    private final MyRandom rnd;
//    private final Random rnd;

    private double getTestRectangleArea() {
        if (!setTestRectangleArea) {
            testRectangleArea = (maxY - minY) * (maxX - minX);
            setTestRectangleArea = true;
        }
        return testRectangleArea;
    }

    private double getRandIn(double min, double max) {
        return min + rnd.nextDouble() * (max - min);
    }

    abstract boolean isContainedPoint(double x, double y);

    IntegralProblemSim() {
        // <Switch rnd>
        rnd = new MyRandom(65539);    // My Random
//        rnd = new Random(65539);    // System Random
    }

    public void generateNextPoint() {
        double x = getRandIn(minX, maxX);
        double y = getRandIn(minY, maxY);
        countAllPoints++;
        if (isContainedPoint(x, y)) countContainedPoints++;
    }

    public double getResult() {
        return resultCoefficient * getTestRectangleArea() * countContainedPoints / countAllPoints;
    }

    public long getCountAllPoints() {
        return countAllPoints;
    }
}
