package week03;

import java.util.*;

public class MigratoryBirds {

    public static void main(String[] args) {
        int n = 6;
        // 1 4 4 4 5 3
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(4);
        arr.add(4);
        arr.add(4);
        arr.add(5);
        arr.add(3);

        int result = migratoryBirds(arr);
        System.out.println(result);
    }

    public static int migratoryBirds(List<Integer> arr) {
        // Write your code here
        Map<Integer, Integer> map = new HashMap<>();
        for(int key: arr){
            if(map.containsKey(key)){
                int freq = map.get(key);
                map.put(key, freq + 1);
            }else{
                map.put(key, 1);
            }
        }
        Set<Integer> keys = map.keySet();
        int currMax = 0;
        int currMaxKey = 0;
        for(int key: keys){
            if(map.get(key) > currMax){
                currMax = map.get(key);
                currMaxKey = key;
            }else if(map.get(key) == currMax && key < currMaxKey) {
                currMaxKey = key;
            }
        }
        return currMaxKey;
    }
}
