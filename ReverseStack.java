import java.util.Stack;

/**
 * Created by suraj on 2/5/2017.
 */
public class ReverseStack {
    public static void reverseStack(Stack<Integer> stack){

        if(stack.empty())
            return;
        int temp = stack.pop();
        reverseStack(stack);
        pushBottom(temp,stack);
    }

    private static void pushBottom(int item, Stack<Integer> stack){
        if(stack.empty() || (stack.peek() > item)){
            stack.push(item);
        }else{
            int top = stack.pop();
            pushBottom(item,stack);
            stack.push(top);
        }
    }


}
