package week04;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class LeftRotation {

    public static void main(String[] args) {
        List<Integer> testList = new ArrayList<>();
        Collections.addAll(testList, 1, 2, 3, 4, 5);
        int d = 4; // the number of element /not index!/ where I have to rotate by from!

        List<Integer> resultList;
        resultList = rotateLeft(d, testList);
        printList(resultList);
    }

    public static List<Integer> rotateLeft(int d, List<Integer> arr) {
        // Write your code here
        List<Integer> res = new ArrayList<>();

        int s = arr.size();
        for (int i = 0; i < s; i++) res.add(arr.get((i+d)%(s)));
        return res;
    }

    private static void printList(List<Integer> arr) {
        for (Integer num : arr) {
            System.out.print(num + " ");
        }
    }
}
