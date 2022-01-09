package week01;

import java.util.List;

public class PlusMinusWorkingSolution {

    public static void plusMinus(List<Integer> arr) {
        // Write your code here

        double pos = 0;
        double zero = 0;
        double neg = 0;
        int total = 0;
        for(int i = 0; i < arr.size(); i++){
            total++;
            if(arr.get(i) > 0) pos++;
            if(arr.get(i) == 0) zero++;
            if(arr.get(i) < 0) neg++;
        }
        pos = (double)(pos/total);
        zero= (double)(zero/total);
        neg = (double)(neg/total);

        pos = (int)(pos*1000000);
        zero = (int)(zero*1000000);
        neg = (int)(neg*1000000);

        pos = (pos/1000000);
        zero= (zero/1000000);
        neg = (neg/1000000);

        System.out.println(pos);
        System.out.println(neg);
        System.out.println(zero);
    }
}
