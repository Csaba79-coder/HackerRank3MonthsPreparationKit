package week5;

import java.util.*;

public class MissingNumbersSolutionWithHashMap {

    public static void main(String[] args) {
        List<Integer> testList1 = new ArrayList<>();
        List<Integer> testList2 = new ArrayList<>();

        Collections.addAll(testList1, 203, 204, 205, 206, 207, 208, 203, 204, 205, 206);
        Collections.addAll(testList2, 203, 204, 204, 205, 206, 207, 205, 208, 203, 206, 205, 206, 204);

        List<Integer> resultList = missingNumbers(testList1, testList2);
        printList(resultList);
    }

    public static List<Integer> missingNumbers(List<Integer> arr, List<Integer> brr) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int num: brr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for(int num: arr) {
            if(map.containsKey(num)) {
                map.put(num, map.getOrDefault(num, 0) - 1);
            }
        }
        List<Integer> ans = new LinkedList<>();
        for(Map.Entry<Integer, Integer> entry: map.entrySet()) {
            if(entry.getValue() > 0) {
                ans.add(entry.getKey());
            }
        }
        return ans;
    }

    private static void printList(List<Integer> arr) {
        for (Integer num : arr) {
            System.out.println(num);
        }
    }
}
