import java.util.LinkedList;

/**
 * Created by suraj on 2/4/2017.
 */
public class PartitionLinkedList {
    public static void partitionList(LinkedList<Integer> linkedList, int pivot){
        LinkedList<Integer> smallerList = new LinkedList<>();
        LinkedList<Integer> equalList = new LinkedList<>();
        LinkedList<Integer> greaterList = new LinkedList<>();
        LinkedList<Integer> outputList = new LinkedList<>();
        for(Integer integer : linkedList){
            if(integer < pivot){
                smallerList.add(integer);
            }else if(integer == pivot){
                equalList.add(integer);
            }else{
                greaterList.add(integer);
            }
        }
        outputList.addAll(smallerList);
        outputList.addAll(equalList);
        outputList.addAll(greaterList);
        for(Integer integer : outputList){
            System.out.print(integer + " ");
        }
    }
}
