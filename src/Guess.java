import java.util.Random;
import java.util.Scanner;

public class Guess {
    public static void main(String[] args) throws Exception{
        try (Scanner scanner = new Scanner(System.in)){
            int number = new Random().nextInt(99) + 1;
            int maxAttempts = 10;
            System.out.println("� ������� ����� �� 1 �� 99. � ���� " + maxAttempts + " ������� �������.");
            do{
                maxAttempts--;
                System.out.println("����� �����");
                int inputValue = scanner.nextInt();

                if(maxAttempts == 0){
                    System.out.println("�� �� ������");
                    break;
                }
                if(inputValue == number){
                    System.out.println("�� ������ � " + (10-maxAttempts) + " �������");
                    break;
                }else if(inputValue < number){
                    System.out.println("��� ����� ������! � ���� �������� " + maxAttempts + " �������");
                }else {
                    System.out.println("��� ����� ������! � ���� �������� " + maxAttempts + " �������");
                }
            }while(maxAttempts > 0);
        }

    }
}
