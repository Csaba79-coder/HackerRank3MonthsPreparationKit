package week02;

import java.util.Collections;
import java.util.List;

public class LonelyIntegerSolution {

    // working with all tests!

    public static int lonelyInteger1(List<Integer> a) {
        // Write your code here

        Collections.sort(a);
        for (int i = 0; i < a.size() - 1; i += 2) {
            if (a.get(i) != a.get(i + 1)) return a.get(i);
        }
        return a.get(a.size() - 1);
    }

    public static int lonelyInteger2(List<Integer> a) {
        // Write your code here

        int unique=a.get(0);
        for(int i=1;i<a.size();i++){
            unique^=a.get(i);
        }
        return unique;
    }
}

