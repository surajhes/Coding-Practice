/**
 * Created by suraj on 2/4/2017.
 */
public class SearchRotatedArray {
    public static int searchRotatedArray(int[] array,int number,int low, int high){
        int mid = (low + high)/2;
        if(array[mid] == number)
            return mid;
        if(low < high){
            if((array[mid] <= array[high]) && ((number >= array[mid]) && (number <= array[high]))){
                return searchRotatedArray(array,number,mid+1,high);
            }else{
                return searchRotatedArray(array,number,low,mid - 1);
            }
        }else{
            return -1;
        }
    }
}
