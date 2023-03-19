package Lesson_2.snilsValidator;

public class SnilsValidatorImpl implements SnilsValidator{
    @Override
    public boolean validate(String snils) {
        if(snils.length() != 11)
            return false;

        char[] snilsArray = snils.toCharArray();

        for (char digit : snilsArray) {
            if(!Character.isDigit(digit))
                return false;
        }

        int snilsControlNumber = Character.digit(snilsArray[9], 10) * 10 + Character.digit(snilsArray[10], 10);
        int calculatedControlNumber;
        int sum = 0;

        for (int i = 0; i < 9; i++)
            sum += Character.digit(snilsArray[i], 10) * (9 - i);
        if(sum < 100)
            calculatedControlNumber = sum;
        else if (sum == 100)
            calculatedControlNumber = 0;
        else{
            if(sum % 101 == 100)
                calculatedControlNumber = 0;
            else
                calculatedControlNumber = sum % 101;
        }

        return calculatedControlNumber == snilsControlNumber;
    }
}
