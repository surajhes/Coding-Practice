import java.util.HashSet;
import java.util.Set;

/**
 * Created by suraj on 10/4/2017.
 */
public class ThreeLargestElementsInArray {
    public static void main(String[] args) {
        int array[] = {-99,-199,3,-50,-9,0};
        int largest,secondLargest, thirdLargest;
        if(array == null){
            System.out.println("Array cant be empty...");
            return;
        }
        if(array.length < 3){
            System.out.println("Not possible to find 3 largest elements");
            return;
        }
        largest = Math.max(array[0],Math.max(array[1],array[2]));
        if(largest == array[0]){
            if(array[1] > array[2]){
                secondLargest = array[1];
                thirdLargest = array[2];
            }else{
                secondLargest = array[2];
                thirdLargest = array[1];
            }
        }else if(largest == array[1]){
            if(array[0] > array[2]){
                secondLargest = array[0];
                thirdLargest = array[2];
            }else{
                secondLargest = array[2];
                thirdLargest = array[0];
            }
        }else{
            if(array[0] > array[1]){
                secondLargest = array[0];
                thirdLargest = array[1];
            }else{
                secondLargest = array[1];
                thirdLargest = array[0];
            }
        }
        for(int i = 3; i < array.length; i++){
            if(array[i] > largest){
                thirdLargest = secondLargest;
                secondLargest = largest;
                largest = array[i];
            }else if((array[i] < largest) &&(array[i] > secondLargest)){
                thirdLargest = secondLargest;
                secondLargest = array[i];
            }else if((array[i] < largest) && (array[i] < secondLargest) && array[i] > thirdLargest){
                thirdLargest = array[i];
            }
        }
        System.out.println(largest + " " + secondLargest + " " + thirdLargest);
        Set<Integer[][]> arraySet = new HashSet<>();
        int temp1[][] = {{1,0,1},{1,0,0},{1,0,1}};
        int temp2[][] = {{1,0,1},{1,0,0},{1,0,1}};

    }
}
