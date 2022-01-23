package week02;

import java.util.List;

public class DiagonalDifference {

    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here
        int left=0,right=0;
        int j=arr.size();
        for(int i=0;i<arr.size();i++){
            j-=1;
            left+=arr.get(i).get(i);
            right+=arr.get(i).get(j);
        }
        return left>right ? left-right :right-left;
    }
}