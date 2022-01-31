package week04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PickingNumbers {

    public static void main(String[] args) {
        List<Integer> testList = new ArrayList<Integer>();
        Collections.addAll(testList, 4, 6, 5, 3, 3, 1);
        //System.out.println(testList.size());

        // expected output: 3

        int result = pickingNumbers(testList);
        System.out.println(result);
    }

    public static int pickingNumbers(List<Integer> a) {
        // Write your code here
        Collections.sort(a);
        int start = 0;
        int i = 0;
        int max = 0;
        while (i < a.size()) {
            if (Math.abs(a.get(start) - a.get(i)) > 1) {
                start = i;
            }
            max = Math.max(max, i - start + 1);
            i++;
        }
        i--;

        return Math.max(max, i - start + 1);
    }
}



