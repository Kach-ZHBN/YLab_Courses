package Lesson_3.fileSort;

import java.io.File;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        File dataFile = new Generator().generate("src/Lesson_3/fileSort/data.txt", 100);
        System.out.println(new Validator(dataFile).isSorted()); // false
        long before = System.currentTimeMillis();
        File sortedFile = new Sorter().sortFile(dataFile);
        System.out.println(new Validator(sortedFile).isSorted()); // true
        System.out.println((System.currentTimeMillis() - before) / 1000);
    }
}
