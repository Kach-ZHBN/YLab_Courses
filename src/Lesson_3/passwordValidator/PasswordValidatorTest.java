package Lesson_3.passwordValidator;

public class PasswordValidatorTest {
    public static void main(String[] args) {
        System.out.println(PasswordValidator.isValid("LoGiN__1903", "pAsWoRd_451_11", "pAsWoRd_451_11"));//true
        System.out.println(PasswordValidator.isValid("LoGiN$%^&*__1903", "pAsWoRd_451_11", "123")); //false
        System.out.println(PasswordValidator.isValid("LoGiN123123456__1903", "pAsWoRd_451_11", "pAsWoRd_451_11"));//false
        System.out.println(PasswordValidator.isValid("LoGiN__1903", "pAsW&oRd_451_11", "pAsWoRd_451_11")); //false
    }
}
