package week03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SalesByMatch {

    public static void main(String[] args) {

        int n = 9;
        List<Integer> socksList = new ArrayList<>();
        // 10 20 20 10 10 30 50 10 20
        socksList.add(10);
        socksList.add(20);
        socksList.add(20);
        socksList.add(10);
        socksList.add(10);
        socksList.add(30);
        socksList.add(50);
        socksList.add(10);
        socksList.add(20);

        int result = sockMerchant(n, socksList);

        System.out.println(result);
    }

    public static int sockMerchant(int n, List<Integer> ar) {
        // Write your code here
        int counter = 0;
        Collections.sort(ar);
        for(int i= 0; i < ar.size() - 1; i += 2) {
            if(ar.get(i).equals(ar.get(i + 1))) {
                counter++;
            } else{
                i = i-1;
            }
        }
        return counter;
    }
}
