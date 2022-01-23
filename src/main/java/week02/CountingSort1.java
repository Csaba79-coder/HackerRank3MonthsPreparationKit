package week02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CountingSort1 {

    public static List<Integer> countingSort(List<Integer> arr) {
        // Write your code here
        List<Integer> res = new ArrayList<>(Collections.nCopies(100, 0));

        arr.forEach((x)-> res.set(x, res.get(x) + 1));
        return res;
    }
}
