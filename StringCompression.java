import java.util.HashMap;
import java.util.Map;

/**
 * Created by suraj on 2/14/2017.
 */
public class StringCompression {
    static void stringCompression(String text){
        char[] chars = text.toCharArray();
        Map<Character,Integer> characterIntegerMap = new HashMap<>();
        for (char aChar : chars) {
            if (characterIntegerMap.containsKey(aChar)) {
                characterIntegerMap.put(aChar, characterIntegerMap.get(aChar) + 1);
            } else {
                characterIntegerMap.put(aChar, 1);
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (Character c :
                characterIntegerMap.keySet()) {
            stringBuilder.append(c);
            stringBuilder.append(characterIntegerMap.get(c));
        }
        if(text.length() < stringBuilder.length())
            System.out.println(text);
        else
            System.out.println(stringBuilder);
    }
}
