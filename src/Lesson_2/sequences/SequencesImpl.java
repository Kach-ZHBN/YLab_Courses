package Lesson_2.sequences;

public class SequencesImpl implements Sequences{

    @Override
    public void a(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print((i * 2) + " ");
        }
        System.out.println();
    }

    @Override
    public void b(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print((i * 2 - 1) + " ");
        }
        System.out.println();
    }

    @Override
    public void c(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print((i * i) + " ");
        }
        System.out.println();
    }

    @Override
    public void d(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print((i * i * i) + " ");
        }
        System.out.println();
    }

    @Override
    public void e(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print((int) (Math.pow( -1 , i)) + " ");
        }
        System.out.println();
    }

    @Override
    public void f(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print((int) (i * Math.pow( -1 , (i - 1))) + " ");
        }
        System.out.println();
    }

    @Override
    public void g(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print((int) (i * i * Math.pow( -1 , (i - 1))) + " ");
        }
        System.out.println();
    }

    @Override
    public void h(int n) {
        int varNum = 1;
        for (int i = 1; i <= n; i++) {
            if(i % 2 == 0){
                System.out.print(0 + " ");
            } else{
                System.out.print(varNum++ + " ");
            }
        }
        System.out.println();
    }

    @Override
    public void i(int n) {
        int previousNum = 1;
            for (int i = 1; i <= n; i++) {
                System.out.print(previousNum * i + " ");
                previousNum *= i;
            }
        System.out.println();
    }

    @Override
    public void j(int n) {
        int prevPreviousNum = 1;
        int previousNum = 0;
        int currentNum;
        for (int i = 1; i <= n; i++) {
            currentNum = prevPreviousNum + previousNum;
            System.out.print(currentNum + " ");
            prevPreviousNum = previousNum;
            previousNum = currentNum;
        }
        System.out.println();
    }
}
