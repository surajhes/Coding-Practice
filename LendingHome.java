import java.util.*;

/**
 * Created by suraj on 10/18/2017.
 */
public class LendingHome {
    private static Map<String,List<Integer>> allocatedMap = new HashMap<>();
    public static void main(String[] args) {
        LendingHome lendingHome = new LendingHome();
        List<Integer> integerList = new LinkedList<>();
        integerList.add(5);
        integerList.add(3);
        integerList.add(1);
        integerList.add(2);
        integerList.add(4);
        int number = lendingHome.nextServerNumber(integerList);
        System.out.println(number);
        System.out.println(lendingHome.allocate("apibox"));
        System.out.println(lendingHome.allocate("apibox"));
        lendingHome.deallocate("apibox1");
        System.out.println(lendingHome.allocate("apibox"));
        System.out.println(lendingHome.allocate("sitebox"));
    }

    public Integer nextServerNumber(List<Integer> list) {
        Collections.sort(list);
        for(int i = 0; i < list.size(); i++){
            if(!list.contains(i+1)){
                return i + 1;
            }
        }
        return list.size() + 1;
    }

    public String allocate(String hostType){
        List<Integer> allocatedList;
        if(allocatedMap.containsKey(hostType)){
            allocatedList = allocatedMap.get(hostType);
        }else{
            allocatedList = new LinkedList<>();
            allocatedMap.put(hostType,allocatedList);
        }
        int nextNumber = nextServerNumber(allocatedList);
        allocatedList.add(nextNumber);
        return  hostType+nextNumber;
    }


    public void deallocate(String hostName) {
        StringBuilder string = new StringBuilder();
        String[] strings = hostName.split("(?<=\\D)(?=\\d)");
        Integer number = Integer.parseInt(strings[1]);
        List<Integer> allocatedList = allocatedMap.get(strings[0]);
        allocatedList.remove(number);
    }


}
