package week03;

import java.util.ArrayList;
import java.util.List;

public class BetweenTwoSets {

    // 2 3
    // 2 4
    // 16 32 96
    // output: 3

    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();

        a.add(2);
        a.add(3);
        b.add(2);
        b.add(4);

        int total = getTotalX(a, b);
        System.out.println(total);
    }

    public static int getTotalX(List<Integer> a, List<Integer> b) {
        // Write your code here

        boolean var;
        boolean var2;
        int i;
        int j;
        int m = 0;
        for(i = a.get(a.size()-1); i <= b.get(0); i++) {
            var = false;
            for(j = 0;j <a.size(); j++) {
                if(i % a.get(j) == 0){
                    var =true;
                }else{
                    var =false;
                    break;
                }
            }
            if(var){
                var2 = false;
                for (Integer integer : b) {
                    if (integer % i == 0) {
                        var2 = true;
                    } else {
                        var2 = false;
                        break;
                    }

                }
                if(var2){
                    m++;
                }
            }
        }
        return m;
    }
}
