import java.util.Map;
import java.util.TreeMap;

/**
 * Created by suraj on 3/27/2017.
 */
public class LexicographycallyFirstPalindromeString {
    final static int NUMBER_OF_ODD_CHAR_ALLOWED = 1;

    public static void firstPalindromeString(String string) {
        if (string == null) {
            return;
        }
        if (string.length() == 0) {
            return;
        }
        string = string.toLowerCase();
        Map<Character, Integer> characterMap = getCharMap(string);
        boolean palindromePossible = canFormPalindrome(characterMap, string);
        if (!palindromePossible) {
            System.out.println("No Smallest Lexicographic palindrome possible");
            return;
        }
        String lexicographicPalindrome = getLexicographicallyPalindrome(characterMap, string);
        System.out.println(lexicographicPalindrome);
    }

    private static String getLexicographicallyPalindrome(Map<Character, Integer> characterMap, String string) {
        StringBuilder palindromeString = new StringBuilder();
        char middleChar = buildFirstPartPalindromeString(characterMap, palindromeString, string);
        if (string.length() % 2 != 0) {
            buildMiddlePartPalindromeString(characterMap, palindromeString, middleChar);
        }
        StringBuilder lastPart = buildLastPartPalindromeString(characterMap);
        palindromeString.append(lastPart);
        return palindromeString.toString();
    }

    private static StringBuilder buildLastPartPalindromeString(Map<Character, Integer> characterMap) {
        StringBuilder palindromeString = new StringBuilder();
        for (Character character : characterMap.keySet()) {
            int count = characterMap.get(character);
            for (int i = 0; i < count; i++) {
                palindromeString.append(character);
            }
            characterMap.put(character, characterMap.get(character) - count);
        }
        return palindromeString.reverse();

    }

    private static void buildMiddlePartPalindromeString(Map<Character, Integer> characterMap, StringBuilder palindromeString, char ch) {
        palindromeString.append(ch);
        int count = characterMap.get(ch);
        count--;
        characterMap.put(ch, count);
    }

    private static char buildFirstPartPalindromeString(Map<Character, Integer> characterMap, StringBuilder palindromeString, String string) {
        int mid = string.length() / 2;
        for (Character character : characterMap.keySet()) {
            if (palindromeString.length() < mid) {
                int count = characterMap.get(character);
                if (count % 2 == 0) {
                    int halfCount = count / 2;
                    for (int i = 0; i < halfCount; i++) {
                        palindromeString.append(character);
                    }
                    characterMap.put(character, count - halfCount);
                } else {
                    return character;
                }
            }
        }
        return string.charAt(mid);
    }

    private static Map<Character, Integer> getCharMap(String string) {
        int length = string.length();
        Map<Character, Integer> characterMap = new TreeMap<>();
        for (int i = 0; i < length; i++) {
            char ch = string.charAt(i);
            if (characterMap.containsKey(ch)) {
                int count = characterMap.get(ch);
                count++;
                characterMap.put(ch, count);
            } else {
                characterMap.put(ch, 1);
            }
        }
        return characterMap;
    }

    private static boolean canFormPalindrome(Map<Character, Integer> characterMap, String string) {
        boolean allCharEvenLength = false;
        if (string.length() % 2 == 0) {
            allCharEvenLength = true;
        }
        int numberOfOddChars = 0;
        for (Character character : characterMap.keySet()) {
            int count = characterMap.get(character);
            if (allCharEvenLength && (count % 2 != 0)) {
                return false;
            } else {
                if (count % 2 != 0) {
                    numberOfOddChars++;
                }
                if (numberOfOddChars > NUMBER_OF_ODD_CHAR_ALLOWED) {
                    return false;
                }
            }
        }
        return true;
    }
}
