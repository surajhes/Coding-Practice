import java.util.*;

/**
 * Created by suraj on 3/27/2017.
 */
public class MostFrequentArrayItem {
    public static void mostFrequestArrayItem(){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        TreeMap<Integer,Integer> integerMap = new TreeMap<>();
        for(int i = 0; i < n; i++){
            int integer = scanner.nextInt();
            if(integerMap.containsKey(integer)){
                int count = integerMap.get(integer);
                count++;
                integerMap.put(integer,count);
            }else{
                integerMap.put(integer,1);
            }
        }
        int highlyFrequent =  integerMap.firstEntry().getKey();
        System.out.println(highlyFrequent);
    }
}
