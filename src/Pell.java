import java.util.Scanner;

public class Pell {
    public static void main(String[] args) throws Exception {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();
            long[] pellsRow = new long[n + 1];
            if(n == 0){
                pellsRow[0] = 0;
            } else {
                pellsRow[0] = 0;
                pellsRow[1] = 1;
                for (int i = 2; i < pellsRow.length; i++) {
                    pellsRow[i] = 2 * pellsRow[i - 1] + pellsRow[i - 2];
                }
            }
            System.out.println(pellsRow[n]);
        }
    }
}
