package Lesson_2.rateLimitedPrinter;

public class RateLimitedPrinter {
    private int interval;
    private long printTime;

    public RateLimitedPrinter(int interval) {
        this.interval=interval;
        this.printTime = System.currentTimeMillis() - interval;
    }

    public void print(String message){
        if(System.currentTimeMillis() - printTime > interval){
            printTime = System.currentTimeMillis();
            System.out.println(message);
        }
    }
}
