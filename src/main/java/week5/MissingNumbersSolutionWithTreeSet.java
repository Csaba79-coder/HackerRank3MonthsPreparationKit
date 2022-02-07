package week5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class MissingNumbersSolutionWithTreeSet {

    // input
    // 10
    // 203 204 205 206 207 208 203 204 205 206
    // 13
    // 203 204 204 205 206 207 205 208 203 206 205 206 204

    // output
    // 204 205 206

    public static void main(String[] args) {
        List<Integer> testList1 = new ArrayList<>();
        List<Integer> testList2 = new ArrayList<>();

        Collections.addAll(testList1, 203, 204, 205, 206, 207, 208, 203, 204, 205, 206);
        Collections.addAll(testList2, 203, 204, 204, 205, 206, 207, 205, 208, 203, 206, 205, 206, 204);

        List<Integer> resultList = missingNumbers(testList1, testList2);
        printList(resultList);
    }
    public static List<Integer> missingNumbers(List<Integer> arr, List<Integer> brr) {
        // Write your code here
        arr.forEach(brr::remove);

        return new ArrayList<>(new TreeSet<>(brr));
    }

    private static void printList(List<Integer> arr) {
        for (Integer num : arr) {
            System.out.println(num);
        }
    }
}
