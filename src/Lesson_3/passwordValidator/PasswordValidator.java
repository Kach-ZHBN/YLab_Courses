package Lesson_3.passwordValidator;

public class PasswordValidator {
    public static boolean isValid(String login, String password, String confirmPassword){
        boolean result = true;
        try{
            if (!login.matches("[a-zA-Z0-9_]+"))
                throw new WrongLoginException("Логин содержит недопустимые символы");
            if (login.length() > 19)
                throw new WrongLoginException("Логин слишком длинный");
        } catch (WrongLoginException e) {
            e.printStackTrace();
            result = false;
        }

        try {
            if (!password.matches("[a-zA-Z0-9_]+"))
                throw new WrongPasswordException("Пароль содержит недопустимые символы");
            if (password.length() > 19)
                throw new WrongPasswordException("Пароль слишком длинный");
            if (!password.equals(confirmPassword))
                throw new WrongPasswordException("Пароль и подтверждение не совпадают");
        } catch (WrongPasswordException e) {
            e.printStackTrace();
            result = false;
        }

        return result;
    }
}
