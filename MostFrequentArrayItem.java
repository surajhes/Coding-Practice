import java.util.*;

/**
 * Created by suraj on 3/27/2017.
 */
public class MostFrequentArrayItem {
    public static void mostFrequestArrayItem(){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Map<Integer,Integer> integerMap = new HashMap<>();
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
        int highlyFrequent = Integer.MAX_VALUE;
        int frequency = Integer.MIN_VALUE;
        for(Map.Entry<Integer,Integer> entry : integerMap.entrySet()){
            if(entry.getValue() >= frequency){
                int tempFrequency = entry.getValue();
                if((tempFrequency >= frequency)){
                    if(tempFrequency > frequency){
                        frequency = entry.getValue();
                        highlyFrequent = entry.getKey();
                    }else{
                        if(entry.getKey() < highlyFrequent){
                            frequency = entry.getValue();
                            highlyFrequent = entry.getKey();
                        }
                    }
                }
            }
        }
        integerMap.clear();
        integerMap = null;
        System.out.println(highlyFrequent);
    }
}
