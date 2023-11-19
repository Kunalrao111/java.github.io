import java.util.HashMap;
import java.util.Map;

public class basic137_7024 {
    public static void main(String[] args) {
        String romanNumeral = "MCMXCIV";
        int number = convertRomanToInteger(romanNumeral);
        System.out.println("The converted integer is: " + number);
    }

    public static int convertRomanToInteger(String romanNumeral) {
        Map<Character, Integer> romanMap = createRomanMap();

        int result = 0;
        int prevValue = 0;

        for (int i = romanNumeral.length() - 1; i >= 0; i--) {
            char currentChar = romanNumeral.charAt(i);
            int currentValue = romanMap.get(currentChar);

            if (currentValue >= prevValue) {
                result += currentValue;
            } else {
                result -= currentValue;
            }

            prevValue = currentValue;
        }

        return result;
    }

    public static Map<Character, Integer> createRomanMap() {
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);
        return romanMap;
    }
}