package week03;

import java.util.List;

public class SubarrayDivision2 {

    public static int birthday(List<Integer> s, int d, int m) {
        // Write your code here
        int numberOfWays=0;
        int sumOfSegment=0;

        for (int i = 0; i<=s.size()-m; i++) {
            sumOfSegment = s.subList(i, i + m ).stream().mapToInt(Integer::intValue).sum();
            if (sumOfSegment == d)
                numberOfWays++;
        }

        return numberOfWays;
    }
}
