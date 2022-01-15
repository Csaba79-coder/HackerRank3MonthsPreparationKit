package week01;

import java.util.ArrayList;
import java.util.List;

public class DivisibleSumPairs {

    public static void main(String[] args) {

        int n = 6;
        int k = 3;
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(3);
        arrayList.add(2);
        arrayList.add(6);
        arrayList.add(1);
        arrayList.add(2);

        int result = divisibleSumPairs(n, k, arrayList);
        System.out.println(result);

    }

    public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
        // Write your code here
        int result = 0;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if((ar.get(i)+ar.get(j))%k==0){
                    result++;
                }
            }
        }

        return result;
    }
}
