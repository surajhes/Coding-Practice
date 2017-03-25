/**
 * Created by suraj on 2/5/2017.
 */
public class ArrayReversalWithRotation {
    static void arrayReverse(int[] array, int d){
        reverse(array,0,d-1);
        reverse(array,d,array.length -1);
        reverse(array,0,array.length -1);
        display(array);
    }

    private static void display(int[] array) {
        for (int anArray : array) {
            System.out.println(anArray);
        }
    }

    private static void reverse(int[] array, int start,int end){
        while (start < end){
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }

}
