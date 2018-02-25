public class MyRandom {
    private static final long multiplier = 65539;       // a
    private static final long increment = 0;            // c
    //private static final long modulus = Long.MAX_VALUE; // m = 2^63 - 1

    private long x;

    public MyRandom(long seed) {
        this.x = seed;
    }

    public double nextDouble() {
        long px = x;
        x = ((multiplier * x + increment) % Long.MAX_VALUE) & Long.MAX_VALUE;  // be in positive range
        return (double)px / (double)Long.MAX_VALUE;
    }
}
