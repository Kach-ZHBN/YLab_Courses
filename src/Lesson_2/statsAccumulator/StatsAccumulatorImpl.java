package Lesson_2.statsAccumulator;

public class StatsAccumulatorImpl implements StatsAccumulator{
    private int min = 0;
    private int max = 0;
    private int count = 0;
    private double avg = 0;

    @Override
    public void add(int value) {
        if(count == 0){
            min = value;
            max = value;
            avg = value;
            count++;
            return;
        }

        if(value < min)
            min = value;
        if(value > max)
            max = value;
        avg = (avg * count + value) / (count + 1);
        count++;

    }

    @Override
    public int getMin() {
        return min;
    }

    @Override
    public int getMax() {
        return max;
    }

    @Override
    public int getCount() {
        return count;
    }

    @Override
    public Double getAvg() {
        return avg;
    }
}
