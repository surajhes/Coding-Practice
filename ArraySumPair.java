/**
 * Created by suraj on 3/26/2017.
 */
public class ArraySumPair {
    public static void arraySumPair(int[] array,int sum){
        if(array == null){
            return;
        }
        int smallest = array[0];
        int largest = array[array.length - 1];
        int secondSmallest = array[1];
        int secondLargest = array[array.length - 2];
        if((sum < (smallest+secondSmallest)) || (sum > (largest + secondLargest))){
            return;
        }
        int i = 0,j = array.length-1;
        while (i < j){
            smallest = array[i];
            largest = array[j];
            if((smallest+largest) == sum){
                System.out.println("("+smallest+","+largest+")");
                i++;
            }
            if((smallest+largest) > sum){
                j--;
            }else if((smallest+largest) < sum){
                i++;
            }
        }
    }
}
