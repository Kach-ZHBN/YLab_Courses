package Lesson_2.rateLimitedPrinter;

public class RateLimitedPrinterTest {
    public static void main(String[] args) {
        RateLimitedPrinter rateLimitedPrinter = new RateLimitedPrinter(1000);
        for (int i = 0; i < 1000000000; i++) {
            rateLimitedPrinter.print(String.valueOf(i));
        }
    }
}
