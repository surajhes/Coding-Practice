import java.util.*;

/**
 * Created by suraj on 2/9/2017.
 */
public class SmallestRotationString {
    static void smallestRotationString(StringBuilder string, int characterIndex){
        Set<String> rotatedString = new TreeSet<>();
        for(int i = 0; i < string.length(); i++){
            for(int j = i+1;j <= string.length();j++){
                rotatedString.add(string.substring(i,j));
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        rotatedString.forEach(stringBuilder::append);
        System.out.println(stringBuilder.charAt(characterIndex-1));
    }}
