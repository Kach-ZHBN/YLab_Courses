package Lesson_2.snilsValidator;

public class SnilsValidatorTest {
    public static void main(String[] args) {
        System.out.println(new SnilsValidatorImpl().validate("01468870570")); //false
        System.out.println(new SnilsValidatorImpl().validate("90114404441")); //true
        System.out.println(new SnilsValidatorImpl().validate("18563248599")); //true
        System.out.println(new SnilsValidatorImpl().validate("56887416584")); //false
        System.out.println(new SnilsValidatorImpl().validate("94235665412")); //false
        System.out.println(new SnilsValidatorImpl().validate("95473215530")); //true
        System.out.println(new SnilsValidatorImpl().validate("53218634574")); //true
        System.out.println(new SnilsValidatorImpl().validate("53218634")); //false
        System.out.println(new SnilsValidatorImpl().validate("5321864d434")); //false
        System.out.println(new SnilsValidatorImpl().validate("jhdikbhydoq")); //false
        System.out.println(new SnilsValidatorImpl().validate("5321 634574")); //false
    }
}
