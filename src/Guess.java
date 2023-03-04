import java.util.Random;
import java.util.Scanner;

public class Guess {
    public static void main(String[] args) throws Exception{
        try (Scanner scanner = new Scanner(System.in)){
            int number = new Random().nextInt(99) + 1;
            int maxAttempts = 10;
            System.out.println("Я загадал число от 1 до 99. У тебя " + maxAttempts + " попыток угадать.");
            do{
                maxAttempts--;
                System.out.println("Введи число");
                int inputValue = scanner.nextInt();

                if(maxAttempts == 0){
                    System.out.println("Ты не угадал");
                    break;
                }
                if(inputValue == number){
                    System.out.println("Ты угадал с " + (10-maxAttempts) + " попытки");
                    break;
                }else if(inputValue < number){
                    System.out.println("Мое число больше! У тебя осталось " + maxAttempts + " попыток");
                }else {
                    System.out.println("Мое число меньше! У тебя осталось " + maxAttempts + " попыток");
                }
            }while(maxAttempts > 0);
        }

    }
}
