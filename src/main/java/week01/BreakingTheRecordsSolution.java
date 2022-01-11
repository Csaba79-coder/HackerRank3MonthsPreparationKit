package week01;

import java.util.Arrays;
import java.util.List;

public class BreakingTheRecordsSolution {

    public static List<Integer> breakingRecords(List<Integer> scores) {
        // Write your code here
        int countMin = -1;
        int countMax = -1;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (Integer score: scores) {
            if (score < min) {
                countMin++;
                min = score;
            }
            if (score > max) {
                countMax++;
                max = score;
            }
        }

        return Arrays.asList(countMax, countMin);
    }
}
