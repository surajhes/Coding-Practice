import java.util.Stack;

/**
 * Created by suraj on 1/26/2017.
 */
public class ParenthesisMatching {
    public static boolean parenthesisMatching(String str){
        Stack<Character> characterStack = new Stack<>();
        if(str.length()%2 != 0){
            return false;
        }
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            switch (ch){
                case '(':
                    characterStack.push(')');
                    break;
                case '{':
                    characterStack.push('}');
                    break;
                case '[':
                    characterStack.push(']');
                    break;
                case ')':
                case '}':
                case ']':
                    if(characterStack.empty() || (characterStack.pop() != ch)){
                        return false;
                    }
                    break;
                default:
            }
        }
        if(!characterStack.empty()){
            return false;
        }
        return true;
    }
}
