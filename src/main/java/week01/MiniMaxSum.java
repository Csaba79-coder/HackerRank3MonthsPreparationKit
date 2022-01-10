package week01;

import java.util.*;

public class MiniMaxSum {

    public static void main(String[] args) {

        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(3);
        arr.add(5);
        arr.add(7);
        arr.add(9);

        miniMaxSumAllNums(arr);
        miniMaxSum(arr);
    }

    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here
        Collections.sort(arr);
        Long minSum = 0L;
        Long maxSum = 0L;

        for (int i = 0; i < arr.size()-1; i++) {
            minSum += arr.get(i);
        }

        for (int i = 1; i < arr.size(); i++) {
            maxSum += arr.get(i);
        }

        System.out.println(minSum + " " + maxSum);
    }

    private static void miniMaxSumAllNums(List<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
        }
        System.out.println(sum);
    }
}
