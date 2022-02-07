package week5;

import java.util.List;

public class SansaAndXOR {

    // input
    // 2
    // 3
    // 1 2 3
    // 4
    // 4 5 7 5

    // output:
    // 2
    // 0

    public static int sansaXor(List<Integer> arr) {
        // Write your code here
        int a = 0;
        if(arr.size() % 2 == 0) {
            return 0;
        }
        for(int i = 0; i < arr.size(); i += 2) {
            a= a^arr.get(i);
        }
        return a;
    }
}
