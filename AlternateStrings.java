/**
 * Created by suraj on 2/7/2017.
 */
public class AlternateStrings {
    static int alternateString(String str){
        int numberOfAlternate = 0;
        char[] chars = str.toCharArray();
        char prevChar = chars[0];
        for(int i = 1; i < chars.length; i++){
            if(prevChar == chars[i]){
                numberOfAlternate++;
            }
            prevChar = chars[i];
        }
        return numberOfAlternate;
    }
}
