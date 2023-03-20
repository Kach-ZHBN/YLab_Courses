package Lesson_3.transliterator;

import java.util.HashMap;
import java.util.Map;

public class TransliteratorImpl implements Transliterator{
    private Map<Character, String> ABC = new HashMap<>();

    public TransliteratorImpl() {
        ABC.put('А', "A");
        ABC.put('Б', "B");
        ABC.put('В', "V");
        ABC.put('Г', "G");
        ABC.put('Д', "D");
        ABC.put('Е', "E");
        ABC.put('Ё', "E");
        ABC.put('Ж', "ZH");
        ABC.put('З', "Z");
        ABC.put('И', "I");
        ABC.put('Й', "I");
        ABC.put('К', "K");
        ABC.put('Л', "L");
        ABC.put('М', "M");
        ABC.put('Н', "N");
        ABC.put('О', "O");
        ABC.put('П', "P");
        ABC.put('Р', "R");
        ABC.put('С', "S");
        ABC.put('Т', "T");
        ABC.put('У', "U");
        ABC.put('Ф', "F");
        ABC.put('Х', "KH");
        ABC.put('Ц', "TS");
        ABC.put('Ч', "CH");
        ABC.put('Ш', "SH");
        ABC.put('Щ', "SHCH");
        ABC.put('Ъ', "IE");
        ABC.put('Ы', "Y");
        ABC.put('Ь', "");
        ABC.put('Э', "E");
        ABC.put('Ю', "IU");
        ABC.put('Я', "IA");
    }

    @Override
    public String transliterate(String source) {
        char[] sourseArray = source.toCharArray();
        String resultString = "";
        for (char item : sourseArray) {
            if(ABC.containsKey(item)){
                resultString += ABC.get(item);
            }else{
                resultString += item;
            }
        }
        return resultString;
    }
}
