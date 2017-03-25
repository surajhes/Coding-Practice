import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Created by suraj on 3/25/2017.
 */
public class MaxProductOf3Numbers {
    private final static Integer NUMBER_OF_LARGEST_NUMBERS = 3;
    public static long maxProduct(int[] array){
        if(array == null){
            return -1;
        }
        if(array.length < NUMBER_OF_LARGEST_NUMBERS){
            return -1;
        }
        long maxProduct = 1;
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(new ReverseComparator());
/*
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
*/
        for(Integer i : array){
            priorityQueue.add(i);
        }
        for(int i = 0; i < NUMBER_OF_LARGEST_NUMBERS; i++){
            int largest = priorityQueue.poll();
            maxProduct = maxProduct * largest;
        }
        System.out.println(maxProduct);
        return maxProduct;
    }

    private static class ReverseComparator implements Comparator<Integer>{

        @Override
        public int compare(Integer o1, Integer o2) {
            return o2 - o1;
        }
    }
}
