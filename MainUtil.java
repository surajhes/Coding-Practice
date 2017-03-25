import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

/**
 * Created by suraj on 1/26/2017.
 */
public class MainUtil {
    public static void main(String[] args) {
        String string = "abc";
        String string1 = new String("abc");
        StringBuilder stringBuilder = new StringBuilder("abc");
        StringBuffer stringBuffer = new StringBuffer("abc");
        //StringCompression.stringCompression("aaaabcccdddiioopppassscc");
        int[] array = {11,3,0,5,8,6};
        System.out.println(MaxProductOf3Numbers.maxProduct(array));

/*
        int[]array = initializeArray();
        Segregate012.segregate(array);
*/
/*
        Scanner scanner = new Scanner(System.in);
        System.out.println("shata");
        int number = scanner.nextInt();
        for(int i = 0; i < number; i++){
            String str = scanner.next();
            int index = scanner.nextInt();
            SmallestRotationString.smallestRotationString(new StringBuilder(str),index);
        }
*/
/*
        String pattern = scanner.next();
        StringSearchTrie.searchPattern(str,pattern);
*/
/*
        Scanner scanner = new Scanner(System.in);
        System.out.println("shata");
        int numberOfItems = scanner.nextInt();
        int[] array = new int[numberOfItems];
        LinkedList<Integer> inputList = new LinkedList<>();
        for(int i = 0; i < numberOfItems; i++){
            inputList.add(scanner.nextInt());
        }
        System.out.println("Pivot Number");
        int pivot = scanner.nextInt();
        PartitionLinkedList.partitionList(inputList,pivot);
*/
/*
        int searchIndex = SearchRotatedArray.searchRotatedArray(array,searchNumber,0,numberOfItems-1);
        if(searchIndex == -1){
            System.out.println("Not Found");
        }
*/
/*
        System.out.println(searchIndex + 1);
*/
/*
        int cols = scanner.nextInt();
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        MatrixRotation.rotateAntiClockWise(matrix);
        System.out.println("Now clockwise");
        MatrixRotation.rotateClockwise(matrix);
*/


    }

    private static int[] initializeArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("shata");
        int numberOfItems = scanner.nextInt();
        int[] array = new int[numberOfItems];
        for(int i = 0; i < numberOfItems; i++){
            array[i] = scanner.nextInt();
        }
        return array;
    }

    private static void initializeStack() {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(223);
        stack.push(34);
        stack.push(411);
        stack.push(54);
        ReverseStack.reverseStack(stack);
        while(!stack.empty()){
            System.out.println(stack.pop());
        }
    }
}