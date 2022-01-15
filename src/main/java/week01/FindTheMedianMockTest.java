package week01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindTheMedianMockTest {

    public static void main(String[] args) {

        List<Integer> arr1 = new ArrayList<>();
        arr1.add(1);
        arr1.add(2);
        arr1.add(3);
        arr1.add(4);
        arr1.add(5);

        List<Integer> arr2 = new ArrayList<>();
        arr2.add(1);
        arr2.add(2);
        arr2.add(3);
        arr2.add(4);
        arr2.add(5);
        arr2.add(6);

        int median1 = findMedian(arr1);
        System.out.println(median1);

        int median2 = findMedian(arr2);
        System.out.println(median2);
    }

    public static int findMedian(List<Integer> arr) {
        // Write your code here
        int median;
        double tempMedian;
        Collections.sort(arr);

        // get count of scores
        int totalElements = arr.size();
        // check if total number of scores is even
        if (totalElements % 2 == 0) {
            int sumOfMiddleElements = arr.get((totalElements/2)) +
                    arr.get(((totalElements / 2) - 1));
            // calculate average of middle elements
            tempMedian = ((double) sumOfMiddleElements) / 2;
        } else {
            // get the middle element
            tempMedian = (double) arr.get((arr.size() / 2));
        }

        median = (int) tempMedian;
        return median;
    }
}
