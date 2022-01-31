package week04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MinimumAbsoluteDifferenceInAnArray {

    public static void main(String[] args) {
        List<Integer> testList = new ArrayList<>();
        Collections.addAll(testList, 3, -7, 0);

        int result = minimumAbsoluteDifference(testList);
        System.out.println(result);
    }

    public static int minimumAbsoluteDifference(List<Integer> arr) {
        // Write your code here
        Collections.sort(arr);
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.size()-1; i++) {
            int currentMin = Math.abs(arr.get(i) - arr.get(i + 1));
            min = Math.min(min, currentMin);
        }
        return min;
    }
}
