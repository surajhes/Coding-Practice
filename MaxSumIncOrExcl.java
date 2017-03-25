/**
 * Created by suraj on 2/5/2017.
 */
public class MaxSumIncOrExcl {
    static void maxSum(int[] array){
        int incl = array[0];
        int excl = 0;
        for(int i = 1; i < array.length; i++){
            int excl_new = (incl > excl) ? incl : excl;
            incl = excl + array[i];
            excl = excl_new;
        }
        System.out.println("Maximum sum in array = "+Math.max(incl,excl));

    }
}
