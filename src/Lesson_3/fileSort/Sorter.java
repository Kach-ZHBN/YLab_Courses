package Lesson_3.fileSort;

import java.io.*;
import java.util.*;

public class Sorter {
    public File sortFile(File dataFile) throws IOException {

        final int CHANK_SIZE = 1_000_000;
        int tempFilesCounter = 0;

        /*
         * Разделние исходнго файла на врменные файлы меньшего размера, которые способен отсортировать в ОЗУ.
         */
        try (FileInputStream fileInputStream = new FileInputStream(dataFile);
             Scanner scanner = new Scanner(fileInputStream)) {
            List<Long> array = new ArrayList<>();
            while(scanner.hasNextLong()){
                array.add(scanner.nextLong());
                if(array.size() >= CHANK_SIZE || !scanner.hasNextLong()){
                    Collections.sort(array);
                    File temp_file = new File("src/Lesson_3/fileSort/temp/temp" + tempFilesCounter++);
                    try(PrintWriter pw = new PrintWriter(temp_file)){
                        for (Long item : array) {
                            pw.println(item);
                        }
                        pw.flush();
                    }
                    array.clear();
                }
            }
        }

        /*
         * В коде ниже сливаю значения из всех временных файлов в общий выходной файл путем сравнивая первых элементов
         * каждого временного файла между собой. Если значения во временном файле заканчиваются, удаляю его из
         * проверяемого перечня. Условием выхода из цикла является закрытие всех временных файлов.
         */

        List<Scanner> scannersList = new ArrayList<>();
        List<Long> tempHeaders = new ArrayList<>();
        for (int i = 0; i < tempFilesCounter; i++) {
            Scanner scanner = new Scanner(new FileInputStream("src/Lesson_3/fileSort/temp/temp" + i));
                tempHeaders.add(i,scanner.nextLong());
                scannersList.add(i, scanner);
        }
        File resultFile = new File("src/Lesson_3/fileSort/sortedData.txt");
        try(PrintWriter resultPW = new PrintWriter(resultFile)){

            while(tempHeaders.size() != 0){
                Long min = Collections.min(tempHeaders);
                int indexOfMinElement = tempHeaders.indexOf(min);
                resultPW.println(min);
                if(scannersList.get(indexOfMinElement).hasNextLong()){
                    tempHeaders.set(indexOfMinElement,scannersList.get(indexOfMinElement).nextLong());
                }else{
                    tempHeaders.remove(indexOfMinElement);
                    scannersList.get(indexOfMinElement).close(); // Закрытие сканнера, который достиг конца документа
                    scannersList.remove(indexOfMinElement);
                }
            }
            resultPW.flush();
        } finally {
            for(Scanner scanner : scannersList){
                scanner.close();
            }
            for (int i = 0; i < tempFilesCounter; i++) {
                File file = new File("src/Lesson_3/fileSort/temp/temp" + i);
                file.deleteOnExit();
            }
        }
        return resultFile;
    }
}
