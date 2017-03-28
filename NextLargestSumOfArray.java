import java.util.Arrays;

/**
 * Created by suraj on 3/27/2017.
 */
public class NextLargestSumOfArray {
    public static void nextLargestSumOfArray(int[] array){
        if(array == null || array.length == 0){
            return;
        }
        int sum = 0;
        for(Integer integer : array){
            sum = sum + integer;
        }
        Arrays.sort(array);
        int midIndex = array.length/2;
        int midNumber = array[midIndex];
        int midSum = midNumber*array.length;
        int lowestSum = array[0] * array.length;
        int largestSum = array[array.length -1] * array.length;
        int lowerIndex = 0,rightIndex = 0;
        if(sum > midSum){
            rightIndex = midIndex;
        }else{
            lowerIndex = midIndex;
            rightIndex = array.length - 1;
        }
        int nextLargestSum = getNextLargestSum(array,sum,lowerIndex,rightIndex);
        System.out.println(nextLargestSum);
    }

    private static int getNextLargestSum(int[] array, int sum, int lowerIndex, int rightIndex) {
        int mid = (lowerIndex + rightIndex)/2;
        while (lowerIndex < rightIndex){
            int midSum = array[mid] * array.length;
            if(midSum > sum){
                lowerIndex = mid+1;
            }else{
                rightIndex = mid-1;
            }
        }
        return array[mid];
    }

}
