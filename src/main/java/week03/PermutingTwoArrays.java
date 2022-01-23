package week03;

import java.util.Collections;
import java.util.List;

public class PermutingTwoArrays {

    public static String twoArrays(int k, List<Integer> A, List<Integer> B) {
        // Write your code here
        Collections.sort(A);
        Collections.sort(B);

        for (int i = 0, j = A.size() - 1; i < A.size(); i++, j--)
            if (B.get(i) + A.get(j) < k) return "NO";

        return "YES";
    }
}
