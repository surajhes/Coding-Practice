/**
 * Created by suraj on 10/6/2017.
 */
public class CodeAccessArrayReverse {
    public static void main(String[] args) {
        int array[] = {1, 1, 1, 1, 1};
        for(int i = 0,j = array.length-1; i < array.length/2; i++,j--){
            array[i] = array[i] ^ array[j];
            array[j] = array[i] ^ array[j];
            array[i] = array[i] ^ array[j];
        }

        for(int num : array){
            System.out.println(num);
        }
    }
}
