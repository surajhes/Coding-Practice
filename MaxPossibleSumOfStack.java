import java.util.Stack;

/**
 * Created by suraj on 3/25/2017.
 */
public class MaxPossibleSumOfStack {
    public static int maxPossibleSumOfStack(Stack<Integer> stack1,Stack<Integer> stack2,Stack<Integer> stack3){
        int sum1 = 0,sum2 = 0,sum3 = 0;
        sum1 = getStackSum(stack1);
        sum2 = getStackSum(stack2);
        sum3 = getStackSum(stack3);
        while (true){
            if(sum1 == sum2 && sum1 == sum3){
                return sum1;
            }
            if(sum1 > sum2 && sum1 > sum3){
                stack1.pop();
                sum1 = getStackSum(stack1);
            }
            if(sum2 > sum1 && sum2 > sum3){
                stack2.pop();
                sum2 = getStackSum(stack2);
            }
            if(sum3 > sum1 && sum3 > sum2){
                stack3.pop();
                sum3 = getStackSum(stack3);
            }
        }
    }

    private static int getStackSum(Stack<Integer> stack) {
        Stack<Integer> temp = (Stack<Integer>) stack.clone();
        int sum = 0;
        while (!temp.isEmpty()){
            sum = sum + temp.pop();
        }
        return sum;
    }

}
