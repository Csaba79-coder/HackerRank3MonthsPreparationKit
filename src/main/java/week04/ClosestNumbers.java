package week04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ClosestNumbers {

    public static void main(String[] args) {

        // input: -20 -3916237 -357920 -3620601 7374819 -7330761 30 6246457 -6461594 266854
        // -20 30
        List<Integer> testList = new ArrayList<>();
        List<Integer> resultList = new ArrayList<>();

        Collections.addAll(testList, -20, -3916237, -357920, -3620601, 7374819, -7330761, 30, 6246457, -6461594, 266854);

        resultList = closestNumbers(testList);
        printList(resultList);
    }

    public static List<Integer> closestNumbers(List<Integer> arr) {
        // Write your code here
        int different = countDifferent(arr);
        Collections.sort(arr);
        List<Integer> resultList = new ArrayList<>();

        for (int i = 0; i < arr.size() - 1; i++) {
            if (different == Math.abs(arr.get(i) - arr.get(i + 1))) {
                resultList.add(arr.get(i));
                resultList.add(arr.get(i + 1));
            }
        }
        return resultList;
    }

    private static void printList(List<Integer> arr) {
        for (Integer num: arr) {
            System.out.print(num + " ");
        }
    }

    private static int countDifferent(List<Integer> arr) {
        Collections.sort(arr);
        int minDifference = Integer.MAX_VALUE;

        for (int i = 0; i < arr.size() - 1; i++) {
            if (Math.abs(arr.get(i) - arr.get(i + 1))< minDifference) {
                minDifference = Math.abs(arr.get(i) - arr.get(i + 1));
            }
        }
        return minDifference;
    }
}
