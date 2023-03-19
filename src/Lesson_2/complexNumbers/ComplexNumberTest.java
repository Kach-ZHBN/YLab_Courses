package Lesson_2.complexNumbers;

public class ComplexNumberTest {
    public static void main(String[] args) {
        ComplexNumber complexNumber1 = new ComplexNumber(-10.54, 29.55);
        ComplexNumber complexNumber2 = new ComplexNumber(45.11, -95.37);
        ComplexNumber complexNumber3 = new ComplexNumber(-2.6);
        System.out.println("1: " + complexNumber1);
        System.out.println("2: " + complexNumber2);
        System.out.println("3: " + complexNumber3);
        ComplexNumber addResult = complexNumber1.add(complexNumber2);
        System.out.println("(" + complexNumber1 + ") + (" + complexNumber2 + ") = " + addResult);
        ComplexNumber subtractResult = complexNumber1.subtract(complexNumber2);
        System.out.println("(" + complexNumber1 + ") - (" + complexNumber2 + ") = " + subtractResult);
        ComplexNumber multiplyResult = complexNumber1.multiply(complexNumber2);
        System.out.println("(" + complexNumber1 + ") * (" + complexNumber2 + ") = " + multiplyResult);
        System.out.println("|" + complexNumber1 + "| = " + complexNumber1.abs());
        System.out.println("|" + complexNumber3 + "| = " + complexNumber3.abs());
    }
}
