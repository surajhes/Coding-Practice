/**
 * Created by suraj on 2/6/2017.
 */
public class Segregate012 {
    static void segregate(int[] array){
        int low = 0,mid = 0,high = array.length-1;
        int temp;
        while (mid <= high){
            switch (array[mid]){
                case 0 :
                    temp = array[low];
                    array[low] = array[mid];
                    array[mid] = temp;
                    mid++;
                    low++;
                    break;
                case 1 :
                    mid++;
                    break;
                case 2:
                    temp = array[high];
                    array[high] = array[mid];
                    array[mid] = temp;
                    high--;
                    break;
            }
        }
     display(array);
    }

    private static void display(int[] array) {
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }

    private static int next(String s){
        int num = 0;
        char[] chars = s.toCharArray();
        char ch;
        StringBuffer outputString = new StringBuffer();
        for(int i = 0; i < chars.length; i++){
            ch = chars[i];
            switch (ch){
                case '1':
                    char nextChar = chars[i+1];
                    break;

            }
        }
        return num;
    }
}
