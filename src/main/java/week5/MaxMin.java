package week5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaxMin {

    public static void main(String[] args) {
        int k = 7;
        List<Integer> testList = new ArrayList<>();
        Collections.addAll(testList, 3, 10, 100, 300, 200, 1000, 20, 30);
        // output 20!!! all test passed!

        int result = maxMin(k, testList);

        System.out.println(result);
    }

    public static int maxMin(int k, List<Integer> arr) {
        // Write your code here
        Collections.sort(arr);
        int result = Integer.MAX_VALUE;

        int i = 0;
        int j = k-1;
        while(j <= (arr.size()-1)){
            int maxValue = arr.get(j);
            int minValue = arr.get(i);

            int diff = maxValue - minValue;
            if(result > diff){
                result = diff;
            }
            j++;
            i++;
        }
        return result;
    }
}
