package Lesson_2.statsAccumulator;

public class StatsAccumulatorTest {
    public static void main(String[] args) {
        StatsAccumulator statsAccumulator = new StatsAccumulatorImpl();
        statsAccumulator.add(5);
        statsAccumulator.add(7);
        statsAccumulator.add(24);
        statsAccumulator.add(49);
        statsAccumulator.add(2);
        statsAccumulator.add(0);
        statsAccumulator.add(-156);
        statsAccumulator.add(-46);

        getParam(statsAccumulator);
    }

    private static void getParam(StatsAccumulator statsAccumulator){
        System.out.println("Avg " + statsAccumulator.getAvg());
        System.out.println("Count " + statsAccumulator.getCount());
        System.out.println("Min " + statsAccumulator.getMin());
        System.out.println("Max " + statsAccumulator.getMax());
    }
}
