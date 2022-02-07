package week5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class GridChallenge {

    // input:
    // 3
    // 3
    // abc
    // lmp
    // qrt
    // 3
    // mpxz
    // abcd
    // wlmf
    // 4
    // abc
    // hjk
    // mpq
    // rtv

    // output:
    // YES
    // NO
    // YES

    public static void main(String[] args) {
        List<String> testList = new ArrayList<>();
        // 1 & 5
        Collections.addAll(testList, "eabcd", "fghij", "olkmn", "trpqs", "xywuv");

        String result = gridChallenge(testList);
        System.out.println(result);
    }
    public static String gridChallenge(List<String> grid) {
        // Write your code here

        int s = grid.size();
        if (s<2) return "YES";
        int l1 = grid.get(0).length();
        int l2 = grid.get(1).length();
        char[] one = new char[l1];
        char[] two = new char[l2];
        for (int i = 0; i < s-1; i++) {
            one = grid.get(i).toCharArray();
            Arrays.sort(one);
            two = grid.get(i + 1).toCharArray();
            Arrays.sort(two);
            if (!comp(one,two)) return "NO";
        }
        return "YES";
    }

    private static boolean comp(char[] one, char[] two) {
        for (int i = 0; i < one.length; i++) {
            if (one[i] > two[i]) return false;
        }
        return true;
    }
}
